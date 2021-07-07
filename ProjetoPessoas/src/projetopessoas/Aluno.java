package projetopessoas;

public class Aluno extends Pessoa {
    private int mat;
    private String curso;

    // Métodos Públicos
    public void cancelarMat() {
        System.out.println("A matrícula será cancelada");
    }
    // Métodos Especiais
    public int getMat() {
        return this.mat;
    }
    public void setMat(int mat) {
        this.mat = mat;
    }
    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
