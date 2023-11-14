public class Peixe extends Animais{
    // atributos
    private boolean jaProcriou;    
    
    // construtor
    public Peixe(char sexo, int velocidade, boolean jaProcriou){
        super(sexo, velocidade);
        this.jaProcriou = false;
    }
    
    // metodo para procriar
    public void procriar(){
        
    }
    
    
    // getters e setters
    public boolean getJaProcriou(){
        return this.jaProcriou;
    }
    
    public void setJaProcriou(boolean jaProcriou){
        this.jaProcriou = jaProcriou;
    }
    
    // impressao
    @Override
    public String toString(){
        String retorno = "";
        retorno += "Peixe - sexo: " + super.getSexo() + "\n";
        retorno += "Peixe - velocidade: " + super.getVelocidade();
        return retorno;
    }
}