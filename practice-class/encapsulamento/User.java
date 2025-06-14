abstract class Funcionario{

    private String nome;
    private double salario;

    Funcionario(String nome, double salario ){
        this.nome = nome;
        this.salario = salario;
    }

    protected final String getNome(){
        return nome;
    }


    protected final double getSalario(){
        return salario;
    }

    
    protected final void setNome(String name){
        this.nome = name;
        System.out.println("Adicionado com sucesso");
    }


    protected abstract double calcularbonus(); 

}

class Gerente extends Funcionario{

    public Gerente (String nome, double salario){
        super(nome, salario);
    }

    @Override
    protected double calcularbonus(){
        double calculo20 = getSalario() * 20;
        double result = calculo20 /100; 
        return result;

    }
}

class Desenvolvedor extends Funcionario{

    public Desenvolvedor(String nome, double salario){
        super(nome, salario);
    }

    @Override
    protected double calcularbonus(){
        double calculo10 = getSalario() * 10;
        double result = calculo10 /100;
        return result;
    }

}
