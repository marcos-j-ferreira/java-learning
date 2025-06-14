public class Main{

    public static void main(String[] args){


        Carro c1 = new Carro("BMW", "M4", 2004, 2);

        c1.exibirInformacoes();
        c1.ligar();

        System.out.println(" ");

        Moto m1 = new Moto("Yamaha","MT-03",2022,"321cc");

        m1.exibirInformacoes();
        c1.ligar();

    }
} 