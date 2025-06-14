interface Carregavel{
    public void carregar();
}

class Dispositivo{

    protected String marca;
    protected String modelo;    

    public Dispositivo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    protected final void exibirInformacoes(){
        System.out.printf("Marca: %s\nModelo: %s\n", marca, modelo);
    }
} 


class Celular extends Dispositivo implements Carregavel{

    Celular(String marca, String modelo){
        super(marca, modelo);
    }

    public void carregar(){
        System.out.println("Carregando via USB-C");
    } 

}

class Notebook extends Dispositivo implements Carregavel {

    Notebook(String marca, String modelo){
        super(marca, modelo);
    }

    public void carregar(){
        System.out.println("Carregando via tomada de 65W");
    }

}

