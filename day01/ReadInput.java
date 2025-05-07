package day01;
import java.util.Scanner;

public class ReadInput{
    public static void main(String[] args){

        Scanner var = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = var.nextLine();

        System.out.println("Enter your age:");
        int age = var.nextInt();

        System.out.println("Enter your gender (M/F):");

        char gender = var.next().charAt(0);

        System.out.println("Welcome " + name+ "!!");
        System.out.println("Your age is " + age);
        System.out.println("Gender: " + gender);

    }
}
