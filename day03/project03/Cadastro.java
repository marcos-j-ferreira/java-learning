package day03.project03;

interface Produtos{
    void codigo();
    void nome ();
    void typee();
    void value();
}


class Comida implements Produtos{

    private int cod, value;
    private String nome, typee;

    Comida(int cod, int value, String nome, String typee){
        this.cod = cod;
        this.value = value;
        this.nome =nome;
        this.typee = typee;

    }

    public void codigo(){
        System.out.println("Hello, World");
    }

    public void nome(){
        System.out.println("Hello, World");

        
    }
    public void typee(){
        System.out.println("Hello, World");

        
    }
    public void value(){
        System.out.println("Hello, World");
    }

}
public class Cadastro {

    public static void main(String[] args){
        System.out.println("Hello, World");
    }
    
}
