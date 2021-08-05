package exercicoconceitospoo;

public class ExercicoConceitosPoo {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula de matemática");
        
        System.out.println(v[0].toString());
        // Pessoa p = new Pessoa("Jão", 35, "M");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Jason", 35, "M", "jaja");
        System.out.println(a[0].toString());
    }
    
}
