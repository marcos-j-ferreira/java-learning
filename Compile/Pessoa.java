public class Pessoa{

    String name;
    int age;

    public Pessoa(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void com(){
        System.out.println("Olá, "+name+", Seja bem-vinda!");
    }

    public void veri(){

        if(age >= 18){
            System.out.printf("Você é maior de idade: %s\n", age);
        }else{
            System.out.printf("Você é menor de idade: %s\n", age);
        }
    }
}