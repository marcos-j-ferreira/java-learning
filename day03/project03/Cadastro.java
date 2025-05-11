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
        this.nome = nome;
        this.typee = typee;

    }

    public void codigo(){
        System.out.println("Seu códgio é: "+cod);
    }

    public void nome(){
        System.out.println("O nome do seu produto é: "+ nome);

        
    }
    public void typee(){
        System.out.println("Seu produto pertence ao typo: "+ typee);

        
    }
    public void value(){
        System.out.println("Seu produto custa: "+ value);
    }

}
public class Cadastro {

    public static void main(String[] args){
        System.out.println("Hello, World");
    }
    
}
