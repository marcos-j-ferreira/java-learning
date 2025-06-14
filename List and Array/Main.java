import java.util.ArrayList;


class Carro{
    private String nome;
    private int ano;

    Carro(String nome, int ano){
        this.nome = nome;
        this.ano = ano;
    }

}

class Main{

    public static void array(){

        float[] car = new float[10];
        int[] number = {1,2,3,4,5};
        int sizee = number.length;


        for(int i = 0; i < sizee; i++){
            System.out.println(number[i]);
        }

    }


    public static void list(){

        ArrayList<String> frutas = new ArrayList<>();

        ArrayList<Carro> carros = new ArrayList<>(); 

        carros.add(new Carro("BMW", 2022));

        Carro c1 = carros.get(0);
        S

        frutas.add("Apple");
        frutas.add("Melancia");
        frutas.add("sei-lá");
        //list.add(3);

        int size = frutas.size();

        for(int i = 0; i < size; i++){
            System.out.println(frutas.get(i));
        }
    }


    public static void main(String[] args){

        //array();

        list();

    }


} 