package novapratica;

public class Novapratica {

    public static void main(String[] args) {
       Caneta c1 = new Caneta("azul", "Bic cristal", 0.5f);       
       c1.setTampada(false);
       c1.escrever();
       c1.escrever();
       c1.escrever();
       c1.status();
    }
}
