package day03;

class Animal{

    public void emitirSom(){
        System.out.println("O animal faz som");
    }
}

class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O gato mia");
    }
}

class Vaca extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("A vaca muge");
    }
}

class Porco extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("E o porca, o que ele faz??");
    }
}

public class Polimorfismo {

    public static void main(String[] args){
        Animal n1 = new Gato();
        Animal n2 = new Vaca();
        Animal n3 = new Porco();

        n1.emitirSom();
        n2.emitirSom();
        n3.emitirSom();

    }
    
}
