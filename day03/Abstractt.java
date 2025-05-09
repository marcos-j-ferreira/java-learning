package day03;


abstract class Pessoa{

    public void dormindo(){
        System.out.println("Dormindo...");
    }

    public abstract void acordar();
}


class Animal extends Pessoa{

    @Override
    public void acordar(){
        System.out.println("Acordando..");
    }
}

public class Abstractt {

    public static void main(String[] args){
        Animal n1 = new Animal();
        n1.dormindo();
        n1.acordar();;
    }
    
}
