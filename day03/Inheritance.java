package day03;

class Carro{

    private String modelo;
    private int ano;

    public String getNome(){
        return modelo;
    }
    
    public int getAno(){
        return ano;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public void ligar(){
        System.out.print("Carro ligado com sucesso");
    }

    public void desligar(){
        System.out.print("Carro desligado com sucesso");
    }

}

class Func extends Carro{

    private int speed;

    public void acelerar(){
        for(int i = 0; i < 200; i++){
            speed = i;
            System.out.println("Carro acelerando ..." +  speed + " Km/h");
            try {
                Thread.sleep(200 - i); 
            } catch (InterruptedException e) {
                System.out.println("Aceleração interrompida!");
            }
        }
    }

    public void freiar(){
        
        if(speed == 0){
            System.out.print("Carro já está parado");
        }else{
            for(int i = speed; i > 0; i--){
                System.out.println("Carro freiando... "+ i+ " km/h");
                try {
                    Thread.sleep(200 - i); 
                } catch (InterruptedException e) {
                    System.out.println("Aceleração interrompida!");
                }
                  
            }
        }
    }
}

public class Inheritance {

    public static void main(String[] args){

        Func c1 = new Func();
        c1.setAno(2000);
        c1.setModelo("BMW");

        String modelo = c1.getNome();
        int ano = c1.getAno();
        
        System.out.print("Seu carro é "+modelo+" do ano "+ano);

        c1.ligar();

        c1.acelerar();

        c1.freiar();
    }
    
}
