package day01;
import java.util.Scanner;

public class Condition {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you age:");
        int age = sc.nextInt();

        if(age >= 18){
            System.out.println("You are of legal age");
        }else{
            System.out.println("You are a minor");
        }


        
    }
    
}
