package represreinoanimal;

public class Mamifero extends Animal {
    // Atributos
    private String corPelo;
    // Métodos Especiais
    public String getCorPelo() {
        return corPelo;
    }
    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
    // Implementação dos métodos abstratos da classe mãe
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
