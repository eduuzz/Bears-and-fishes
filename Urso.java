public class Urso extends Animais{
    // construtor
    public Urso(char sexo, int velocidade){
        super(sexo, velocidade);
    }
    
    // metodo atacar peixe
    public void atacarPeixe(){
       
    }
    
    // impressao
    @Override
    public String toString(){
        String retorno = "";
        retorno += "Urso - sexo: " + super.getSexo() + "\n";
        retorno += "Urso - velocidade: " + super.getVelocidade();
        return retorno;
    }
}