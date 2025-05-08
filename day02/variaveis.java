package day02;

public class Variaveis {

    // variáveis de instância (ou de classe)

    public static int age = 20; 
    // Visível para outras classes 

    private static String nome = "Mrcos";
    // Visível somente dentro da classe

    protected static char sexo = 'M';
    // visível na mesma classe e sub classes

    static String fullName= "Marcos júnior";
    // vazia ela é visível apenas dentro do package


    public static void main(String[] args){


        // Variáveis locais (dentro de métodos)
        int idade = 30;
        String name = "Ana";


        System.out.println(age);
        System.out.println(nome);
        System.out.println(sexo);
        System.out.println(fullName);

    }
}
