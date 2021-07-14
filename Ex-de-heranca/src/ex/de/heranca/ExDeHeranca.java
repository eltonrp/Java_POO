package ex.de.heranca;

public class ExDeHeranca {

    public static void main(String[] args) {
        // Pessoa p1 = new Pessoa(); -> não é possível instanciar uma classe abstrata
        Visitante v1 = new Visitante();
        v1.setNome("Alfredo");
        v1.setIdade(37);
        v1.setSexo("M");
        System.out.println(v1.toString());
        Aluno a1 = new Aluno();
        a1.setNome("Augusto");
        a1.setSexo("M");
        a1.setIdade(28);
        a1.pagarMensalidade();
        System.out.println(a1.toString());
    }
    
}
