package exercicoconceitospoo;

public class ExercicoConceitosPoo {

    public static void main(String[] args) {
        Video v[] = new Video[2];
        v[0] = new Video("Aula de matemática");
        v[1] = new Video("Curso de Python");
        
        Aluno a[] = new Aluno[2];
        a[0] = new Aluno("Jason", 35, "M", "jaja");
        a[1] = new Aluno("Romeu", 42, "M", "romeu");
        
        Visualizacao vis[] = new Visualizacao[3];
        vis[0] = new Visualizacao(a[1], v[0]);
        vis[0].avaliar(85.0f);
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(a[1], v[1]);
        vis[1].avaliar(10);
        System.out.println(vis[1].toString());
        vis[2] = new Visualizacao(a[0], v[1]);        
        vis[2].avaliar();
        System.out.println(vis[2].toString());
        
        /*System.out.println("Vídeos\n-----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println("-------------------");
        System.out.println("Alunos\n--------------------");
        System.out.println(a[0].toString());
        System.out.println(a[1].toString());
        System.out.println("---------------------");*/
    }
    
}
