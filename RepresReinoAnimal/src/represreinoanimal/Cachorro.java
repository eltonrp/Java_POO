package represreinoanimal;

public class Cachorro extends Mamifero {
    @Override
    public void emitirSom() {
        System.out.println("Latindo");
    }
    public void reagir(boolean dono) {
        if (dono) {
            System.out.println("Au Au Au!");
            System.out.println("Abanando o rabo...");
        } else {
            System.out.println("Rosnando");
            }
    }
    public void reagir(int idade, float peso){
        if (idade < 8 && peso < 12f){
            System.out.println("Fazendo festa...");
        } else {
            System.out.println("Cheirando e abanando o rabo");
        }
    }
}
