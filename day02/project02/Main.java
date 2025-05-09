package day02.project02;
import java.util.*;

class Login{

    private String[] nome = {"userForte"};
    
    private String[] senha = {"senhaForte"};

    String user, password;

    Login(String user, String password){
        this.user = user;
        this.password = password;
    }

    public boolean login(){
        return user.equals(nome[0]) && password.equals(senha[0]); 
    }

    public void validar(boolean result){

        if(result == true){
            System.out.println("Login feito com sucesso");
        }else{
            System.out.println("Falha ou efetuar o login");
        }
    }
}

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Login login01 = new Login("userForte", "senhaForte");
        boolean result = login01.login();
        login01.validar(result);

        System.out.print("Digite seu nome de usuário: ");
        String user = sc.next();
        System.out.print("Digite sua senha: ");
        String senha = sc.next();
        
        String[] teste = {user, senha};
        Arrays.toString(teste);

        Login login02 = new Login(teste[0], teste[1]);
        boolean result01 = login02.login();
        login02.validar(result01);

    }
}
