import java.util.Random;
public class Animais{
    
    // atributos
    private char sexo;
    private int velocidade;
    
    public Animais(char sexo, int velocidade){
        this.sexo = sexo;
        this.velocidade = velocidade;
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