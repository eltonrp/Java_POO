package ex.de.heranca;

public class Bolsista extends Aluno {
    private float bolsa;
    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }
    @Override
    public void pagarMensalidade() {
        System.out.println(this.nome + " é bolsista, pagamento facilitado!");
    }
    public float getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
