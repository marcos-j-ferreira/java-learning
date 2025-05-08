package day02;

class Pessoa{

    // Atributos da classe
    private int age;
    private String nome;

    // construtor
    Pessoa(int age, String nome){
        this.age = age;
        this.nome = nome;
    }

    // método da classe
    public final void hello(){
        System.out.println("Seja bem vindo: "+nome+" Você tem: "+ age+ " anos");

    }
}

public class Classe {

    public static void main(String[] args){

        // objeto, uma instacia da classe
        Pessoa p1 = new Pessoa(30, "Marcos");
        p1.hello();

        Pessoa p2 = new Pessoa(20, "Maria");
        p2.hello();

        Pessoa p3 = new Pessoa(17, "Luiza");
        p3.hello();
        
    }    
}


