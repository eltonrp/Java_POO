package represreinoanimal;

public class Ave extends Animal {
    // Atributos
    private String corPena;
    // Métodos especiais
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    // Implementação dos métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Voando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }
    // Método de Ave
    public void contruirNinho () {
        System.out.println("Construiu um ninho");
    }
}
