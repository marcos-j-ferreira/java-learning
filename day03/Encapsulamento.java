package day03;

class Pessoa{

    // Atributos privados (encapsulados)
    private String nome;
    private int idade;

    // Getter para nome
    public String getNome(){
        return nome;
    }

    // Getter para idade
    public int getIdade(){
        return idade;
    }

    // Setter para nome
    public void setNome(String nome){
        this.nome = nome;
    }

    // Setter para idade
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }
    }

}

public class Encapsulamento {

    public static void main(String[] args){

        Pessoa p1 = new Pessoa();
        p1.setIdade(20);
        p1.setNome("John");

        String name = p1.getNome();
        int idade = p1.getIdade();

        System.out.print("Seu nome é: "+ name+", e sua idade é: "+ idade);

    }

}
