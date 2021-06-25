package simulacaobancaria;

public class ContaBancaria {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean ativa;
    
    // Métodos Personalizados
    public void abrirConta(String tipo){
        this.setTipo(tipo);
        this.setAtiva(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso!");
    }
    
    public void fecharConta(){
        
    }
    
    public void depositar() {
        
    }
    
    public void sacar() {
        
    }
    
    public void pagarMensal() {
        
    }
    
    // Método Construtor
    public ContaBancaria () {
        this.setSaldo(0);
        this.setAtiva(false);
    }
    
    // Métodos Getters e Setters
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
} // fim da classe
