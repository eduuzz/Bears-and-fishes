import java.util.Random;
import java.util.*;
public class Lago{
    //Atributos
    private Animais[] array_margem1;
    private Animais[] array_margem2;
    private Animais[] array_agua1;
    private Animais[] array_agua2;
    private int tamanho_arrays;
    private int max_ursos;
    private int max_peixes;
    private int max_pescadores;
    
    //Construtor
    public Lago(){
        this.tamanho_arrays = (int)(Math.random() * (10 - 5 + 1) + 5);
        this.array_margem1 = new Animais[tamanho_arrays];
        this.array_margem2 = new Animais[tamanho_arrays];
        this.array_agua1 = new Animais[tamanho_arrays];
        this.array_agua2 = new Animais[tamanho_arrays];
        this.max_ursos = (int)(Math.random() * (5 - 1 + 1) + 1);
        max_peixes = (int)(Math.random() * (12 - 5 + 1) + 5);
        this.max_pescadores = (int)(Math.random() * (2 - 1 + 1) + 1);
        
        if(max_peixes > (array_agua1.length + array_agua2.length)) {
            this.max_peixes = tamanho_arrays;
        }
        else{
            this.max_peixes = max_peixes;
        }
        
        geraAnimais();
    }
    //Getters e Setters
    public int getTamanho_arrays() {
        return this.tamanho_arrays;
    }
    public int getMax_ursos() {
        return this.max_ursos;
    }
    public int getMax_peixes() {
        return this.max_peixes;
    }
    public int getMax_pescadores() {
        return this.max_pescadores;
    }
    
    //Métodos
    public void geraAnimais() {
        for (int i = 0; i < getMax_ursos(); i++) {
            int valorAleatorio = (int)(Math.random() * (10 - 1 + 1) + 1); //gera valores de um a dez
            int velocidade = (int)(Math.random() * (20 - 1 + 1) + 1); // gera valores de um a vinte
            char sexo = 'X';
            if (valorAleatorio % 2 == 0) {
                sexo = 'M'; //Se o valor é par, então o animal será macho
            } 
            else {
                sexo = 'F'; //Se o valor aleatório é ímpar, então o animal será fêmea
            } 
            if (valorAleatorio % 2 == 0) {
                this.array_margem1[i] = new Urso(sexo, velocidade); //Se o valor é par, então o animal vai estar na margem 1
            } 
            else {
                this.array_margem2[i] = new Urso(sexo, velocidade);
            }
        }
        for (int i = 0; i < getMax_pescadores(); i++) {
            int valorAleatorio = (int)(Math.random() * (10 - 1 + 1) + 1); 
            int velocidade = (int)(Math.random() * (20 - 1 + 1) + 1);
            char sexo = 'X';
            if (valorAleatorio % 2 == 0) {
                sexo = 'M';
            } 
            else {
                sexo = 'F';
            }
            if (valorAleatorio % 2 == 0) {
                if(this.array_margem1[i] == null){ //Verifica se está vazio, há possibilidade de ter um urso
                    this.array_margem1[i] = new Pescador(sexo, velocidade);
                }
            }
            else {
                if(this.array_margem2[i] == null){
                    this.array_margem2[i] = new Pescador(sexo, velocidade);
                }
            }
        }
        for (int i = 0; i < getMax_peixes(); i++) {
            int valorAleatorio = (int)(Math.random() * (20 - 1 + 1) + 1);
            int velocidade = (int)(Math.random() * (20 - 1 + 1) + 1);
            char sexo = 'X';
            if (valorAleatorio % 2 == 0) {
                sexo = 'M';
            } 
            else {
                sexo = 'F';
            }
            if (i < getTamanho_arrays()) {
                if (valorAleatorio % 2 == 0) {
                    this.array_agua1[i] = new Peixe(sexo, velocidade); //Se o valor é par, então o animal vai estar na agua 1
                } 
                else {
                    this.array_agua2[i] = new Peixe(sexo, velocidade);
                }
            }
            if (i > getTamanho_arrays()) { //Quando i for maior que tamanho de uma array, vamos zerar a contagem novamente e procurar o primeiro espaço vazio em cada uma das arrays.
                for (int x = 0; x < getTamanho_arrays(); x++) {
                    if (this.array_agua1[x] == null) {
                        this.array_agua1[x] = new Peixe(sexo, velocidade); 
                        break;
                    }
                    else if (this.array_agua2[x] == null) {
                        this.array_agua2[x] = new Peixe(sexo, velocidade); 
                        break;
                    }
                }
            }
        }
    }
    
    // metodo randomização do array
    public void randomizaArray(){
        //margem1
        List<Animais> list1 = Arrays.asList(this.array_margem1); //converte o array para uma lista (list)
        Collections.shuffle(list1); //usa o shuffle para embaralhar a lista
        list1.toArray(this.array_margem1); //converte a lista de volta para um array
        //margem2
        List<Animais> list2 = Arrays.asList(this.array_margem2);
        Collections.shuffle(list2);
        list2.toArray(this.array_margem2);
        //agua1
        List<Animais> list3 = Arrays.asList(this.array_agua1);
        Collections.shuffle(list3);
        list3.toArray(this.array_agua1);
        //agua2
        List<Animais> list4 = Arrays.asList(this.array_agua2);
        Collections.shuffle(list4);
        list4.toArray(this.array_agua2);
    }
    
    // impressao
    @Override
    public String toString() {
        String retorno = "";
        retorno += "array_margem1   " + "array_agua1  " + "array_agua2  " + "array_margem2\n";
        for (int i = 0; i < tamanho_arrays; i++) {
            String margem1 = "#";
            String margem2 = "#";
            String agua1 = "~";
            String agua2 = "~";
            if (this.array_margem1[i] instanceof Urso) {
                margem1 = "Urso";
            }
            else if(this.array_margem1[i] instanceof Pescador) {
                margem1 = "Pescador";
            }
            if (this.array_margem2[i] instanceof Urso) {
                margem2 = "Urso";
            }
            else if (this.array_margem2[i] instanceof Pescador) {
                margem2 = "Pescador";
            }
            if (this.array_agua1[i] instanceof Peixe) {
                agua1 = "Peixe";
            }
            if (this.array_agua2[i] instanceof Peixe) {
                agua2 = "Peixe";
            }
            retorno += "     " + margem1 + "        " + agua1 + "           " + agua2 + "           " + margem2 + "\n";
        }
        return retorno;
    }
}