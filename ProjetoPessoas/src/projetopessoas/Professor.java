package projetopessoas;

public class Professor extends Pessoa {
    // Atributos
    private String especialidade;
    private float salario;

    // Métodos Públicos
    public receberAumento(float aum) {
        this.salario += aum;
    }
    // Métodos Especiais
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String espec) {
        this.especialidade = espec;
    }
    public float getSalario() {
        return this.salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
}
