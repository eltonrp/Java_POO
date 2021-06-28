package simulacaobancaria;

public class SimulacaoBancaria {

    public static void main(String[] args) {

        ContaBancaria c1 = new ContaBancaria();
        c1.setNumConta(55);
        c1.setCliente("José Jamelão");
        c1.abrirConta("CP");
        c1.depositar(300);
        c1.estadoAtual();
        c1.fecharConta();
        c1.sacar(450);
        c1.fecharConta();
        c1.estadoAtual();
    }
    
}
