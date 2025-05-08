package day02;

public class Func {
    
    public static int soma(int x, int y){
        return x + y;

        /* 
         public -> Qualquer classe pode chamar ela
         static -> ela pertence a classe, não preciça criar um objeto para chamar ela
         int -> retorna um número inteiro 
          
        */
    }

    private static void nome(String... nomes){
        for(String nome: nomes){
            System.out.println(nome);
        }

        /*
         private -> Só a própria classe pode acessar essa função
         static   -> Ela pertence a classe 
         void -> Ela não retorna nada
         string...nomes -> não está definido o tamanho do parametro, pode ser uma, duas ou mais nomes
         
         */
    }

    protected static final void hello(){
        System.out.println("Hello, World");

        /*
         protected -> Só a classe e o pacote pode chamar essa função
         static -> Ela pertence a classe 
         final -> Não pode ser modificado com subclasses
         void -> não retorna nada
         */
    }

    public static void main(String[] args){
        System.out.println(soma(10,20));

        nome("marcos","luiz","ana");

        hello();
    }
}
