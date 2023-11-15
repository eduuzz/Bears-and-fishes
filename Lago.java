public class Lago{
    // atributos
    private Animais[] array_margem1;
    private Animais[] array_margem2;
    private Animais[] array_agua1;
    private Animais[] array_agua2;
    private int tamanho_arrays;
    private int max_ursos;
    private int max_peixes;
    private int max_pescadores;
    
    // construtor
    public Lago(){
        this.array_margem1 = new Animais[tamanho_arrays];
        this.array_margem2 = new Animais[tamanho_arrays];
        this.array_agua1 = new Animais[tamanho_arrays];
        this.array_agua2 = new Animais[tamanho_arrays];
        this.tamanho_arrays = tamanho_arrays;
        this.max_ursos = (int)(Math.random() * (5 - 1 + 1) + 1);
        this.max_peixes = (int)(Math.random() * (12 - 5 + 1) + 5);
        this.max_pescadores = (int)(Math.random() * (2 - 1 + 1) + 1);
    }
}