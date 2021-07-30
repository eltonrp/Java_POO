package represreinoanimal;

public class Reptil extends Animal {
    // Atributos
    private String corEscama;
    // Métodos especiais
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // Implementação de métodos abstratos
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void alimentar() {
        System.out.println("Comendo insetos");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }
}
