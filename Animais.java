import java.util.Random;
public class Animais{
    
    // atributos
    private char sexo;
    private int velocidade;
    
    public Animais(char sexo, int velocidade){
        this.sexo = sexo;
        this.velocidade = velocidade;
        randomiza();
    }
    
    // randomiza sexo e velocidade 
    public void randomiza(){
        Random rand = new Random();
        
        int velocAle = rand.nextInt(20) + 1;
        velocidade = velocAle;
        
        int num = rand.nextInt(2);
        if(num == 0){
            sexo = 'M';
        }else{
            sexo = 'F';
        }   
    }
    
    public char getSexo(){
        return this.sexo;
    }
    
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    
    public int getVelocidade(){
        return this.velocidade;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += "Sexo: " + this.getSexo() + "\n";
        retorno += "Velocidade: " + this.getVelocidade();
        return retorno;
    }

}