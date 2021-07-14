package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.setIdade(18);
        p1.setNome("João Bolão");
        p1.setSexo("M");
        System.out.println(p1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Maculele");
        a1.setIdade(28);
        a1.setSexo("M");
        a1.setCurso("Tricô");
        a1.setMat(1111);
        System.out.println(a1.toString());
    }
    
}
