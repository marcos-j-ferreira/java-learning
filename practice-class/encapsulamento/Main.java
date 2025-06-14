public class Main{

    public static void main(String[] args){

        Gerente adm = new Gerente("Marcos ", 1513);

        System.out.println("Nome: " + adm.getNome());
        System.out.println("Salário base: R$" + adm.getSalario());
        System.out.println("Salário com bônus de 20%: R$" + adm.calcularbonus());


        Desenvolvedor admD = new Desenvolvedor("john", 200);

        System.out.println("Nome: " + admD.getNome());
        System.out.println("Salário base: R$" + admD.getSalario());
        System.out.println("Salário com bônus de 10%: R$" + admD.calcularbonus());


    }
}