package simulacaobancaria;

public class ContaBancaria {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean ativa;
    
    // Métodos
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean status) {
        this.ativa = status;
    }
    
    // Método Construtor
    public ContaBancaria () {
        saldo = 0;
        ativa = false;
    }
}
