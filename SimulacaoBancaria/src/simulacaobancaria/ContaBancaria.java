package simulacaobancaria;

public class ContaBancaria {
    
    // Atributos
    public int numConta;
    protected String tipo;
    private String cliente;
    private float saldo;
    private boolean ativa;
    
    // Método Construtor
    public ContaBancaria () {
        this.setSaldo(0);
        this.setAtiva(false);
    }
    
    // Métodos Personalizados
    public void estadoAtual(){
        System.out.println("----------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Cliente: " + this.getCliente());
        System.out.println("Saldo: " + this.getSaldo());
        if (isAtiva()) {
            System.out.println("Conta Ativa");
        }   else {
            System.out.println("Conta Inativa");
        }
        
    }
    
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
        if (this.getSaldo() > 0) {
            System.out.println("Ainda há dinheiro na conta\nPara continuar realize um saque");
        } else if (this.getSaldo() < 0) {
            System.out.println("Conta em débito\nPague oque deve para continuar");
        } else {
            this.setAtiva(false);
        }
    }
    
    public void depositar(float valor) {
        if (this.isAtiva()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Deposito de R$" + valor + " na conta de " + this.getCliente());
        } else {
            System.out.println("Impossível realizar o depósito\nConta inativa");
        }
    }
    
    public void sacar(float valor) {
        if (this.isAtiva()) {
            if (this.getSaldo() >= valor) {
                this.setSaldo(this.getSaldo() - valor);
                System.out.println("Saque de R$" + valor + " realizado na conta de " + this.getCliente());
            } else {
                System.out.println("Saldo insuficiente para o saque");
            }   
        } else {
            System.out.println("Conta inativa\nImpossível realizar o saque.");
        }
    }
    
    public void pagarMensal() {
        int tarifa = 0;
        if ("CC".equals(this.getTipo())) {
            tarifa = 12;
        } else if ("CP".equals(this.getTipo())) {
            tarifa = 20;
        }
        if (this.isAtiva()) {
            this.setSaldo(this.getSaldo() - tarifa);
            System.out.println("Mensalidade paga com sucesso!");
        } else {
            System.out.println("Essa conta foi encerrada!");
        }
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
