package projetopessoas;

public class Funcionario extends Pessoa {
    // Atributos
    private String setor;
    private boolean trabalhando;

    // Métodos Públicos
    public void mudaTrabalho() {
        this.trabalhando = !this.trabalhando;
    }
    // Métodos Especiais
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public boolean isTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trab) {
        this.trabalhando = trab;
    }
}
