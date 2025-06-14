class Veiculo{

    protected String marca;
    protected String modelo;
    protected int ano;

    Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    protected void exibirInformacoes(){

        System.out.printf("Nome: %s \nModelo: %s\nAno: %d", marca, modelo, ano);
    }

    protected final void ligar(){
        System.out.println("Carro ligado...");
    }

}

class Carro extends Veiculo{

    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas){
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    protected void exibirInformacoes(){
        System.out.printf("Nome: %s \nModelo: %s\nAno: %d\nNúmero de portas: %d\n",marca, modelo, ano, numeroDePortas);
    }

}

class Moto extends Veiculo{

    private String tipoDeMotor;

    public Moto(String marca, String modelo, int ano, String tipoDeMotor){
        super(marca, modelo, ano);
        this.tipoDeMotor = tipoDeMotor;
    }

    @Override
    protected void exibirInformacoes(){
        System.out.printf("Nome: %s \nModelo: %s\nAno: %d\nTipo de motor: %s\n",marca, modelo, ano, tipoDeMotor);

    }
}