package criacao_interface;

public class Criacao_Interface {

    public static void main(String[] args) {
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.maisVolume();
        c.maisVolume();
        c.ligarMudo();
        c.play();
        c.abrirMenu();
        c.fecharMenu();
        c.desligarMudo();
        c.abrirMenu();
        c.fecharMenu();
    }
    
}
