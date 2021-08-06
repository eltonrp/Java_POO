package exercicoconceitospoo;

public class Visualizacao {
    /* Criando relação de agregação entre classes
    Os atributos espectador e filme são instâncias de outras classes
    Aluno e Video, respectivamente */
    private Aluno espectador;
    private Video filme;
    // Construtor
    public Visualizacao(Aluno espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.filme.setViews(this.filme.getViews() + 1);
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
    }
    
    /* Criando métodos com sobrecarga
    É utilizado conceito de polimorfismo de sobrecarga, em que há vários
    métodos iguais, mesmo nome, com assinaturas diferentes, ou seja,
    diferem em quantidade e tipo de atributos
    */
    
    public void avaliar() {
        this.filme.setAvaliacao(5);
    }
    public void avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }
    public void avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }
    
    // Getters e Setters
    public Aluno getEspectador() {
        return espectador;
    }
    public void setEspectador(Aluno espectador) {
        this.espectador = espectador;
    }
    public Video getFilme() {
        return filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", \nfilme=" + filme + '}';
    }
}
