package day03;

interface Computador{
    void ligar();
    void memoria();
    void desligar();

}

class Lenovo implements Computador{

    public void ligar(){
        System.out.println("Computador ligando..");
    }

    public void memoria(){
        System.out.println("A memória está sendo usada...");
    }

    
    public void desligar(){
        System.out.println("Computador desligando...");
    }
}

public class Interfaces {
    
    public static void main(String[] args){
        Computador c1 = new Lenovo();

        c1.ligar();
        c1.memoria();
        c1.desligar();
    }
}
