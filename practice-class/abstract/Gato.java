class Gato extends Animal{

    @Override
    protected final void som(){
        System.out.println("Gato faz: miau, miau");
    }  

    @Override
    protected final void pernas(){
        System.out.println("Um gato tem 4(quatro) patas");
    }

    protected final void andar(){
        System.out.println("Um gato pode andar por cima dos telhados");
    }

}