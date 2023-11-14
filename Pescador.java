public class Pescador extends Animais{
    // construtor
    public Pescador(char sexo, int velocidade){
        super(sexo, velocidade);
    }
    
    // metodo de atirar
    public void atirarNoUrso(){
        
    }
    
    // metodo para pescar
    public void pescarPeixe(){
        
    }
    
    @Override
    public String toString(){
        String retorno = "";
        retorno += "Pescador - sexo: " + super.getSexo() + "\n";
        retorno += "Pescador - velocidade: " + super.getVelocidade();
        return retorno;
    }
}