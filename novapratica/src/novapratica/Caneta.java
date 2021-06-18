package novapratica;

public class Caneta {
    // Atributos
    private String color;
    private float ponta;
    private String modelo;
    private int carga;
    private boolean tampada;
    
    // Construtor
    public Caneta(String color, String modelo, float ponta) {
        this.setColor(color);
        this.setModelo(modelo);
        this.setPonta(ponta);
        this.setTampada(true);
        this.setCarga(100);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    // Métodos
    public void escrever(){
        if (!tampada && carga > 0) {
            System.out.println("Estou escrevendo...");
            carga -= 50;
        } else if (tampada) {
            System.out.println("Caneta tampada, não é possível escrever!");
        } else if (!tampada && carga ==0) {
            System.out.println("Acabou a carga da caneta, favor repor");
        }
    }
    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.color);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        if (tampada){
            System.out.println("A caneta está tampada");
        } else {
            System.out.println("Caneta destampada");
        }
    }
}
