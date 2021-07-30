package represreinoanimal;

public class RepresReinoAnimal {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.setPeso(35.5f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println(m.getCorPelo());
        // Agora Polimorfismo em ação
        System.out.println("Repare nos diferentes comportamentos, chamando o mesmo método");
        m.locomover();
        r.locomover();
        p.locomover();
        a.locomover();
        Canguru c = new Canguru();
        c.locomover();
        Cachorro k = new Cachorro();
        k.emitirSom();
        System.out.println("Testando Polimorfismo de Sobrecarga:");
        k.reagir(true);
        k.reagir(false);
        k.reagir(5, 8.5f);
        k.reagir(12, 11);
    }
}
