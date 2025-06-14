public class Main{

    public static void main(String[] args){

        Carregavel[] dispositivos = {
            new Celular("Samsung", "Galaxy"),
            new Notebook("Apple", "Iphone14"),
            new Celular("Redminote", "sad2")
        };

        for(Carregavel d : dispositivos){
            if(d instanceof Dispositivo){
                ((Dispositivo)d).exibirInformacoes();
            }
            d.carregar();
            System.out.println();
        }

    }
}