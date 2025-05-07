package day01.project01;
import java.util.Scanner;

public class Calculator {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        boolean start = true;
        
        while(start){

            System.out.println("Enter a number:");
            int x = sc.nextInt();
    
            System.out.println("Enter other number:");
            int y = sc.nextInt();
    
            System.out.println("choose a mathematical operation:");
            System.out.print(" 1 - sum [ + ]");
            System.out.print(" 2 - multiply [ * ]");
            System.out.print(" 3 - Subtraction [ - ]");
            System.out.print(" 4 - Division [ / ]");
            int ope = sc.nextInt();
            int result;
            System.out.println("Os números digitados foram "+ x + " e " + y);


            if(ope >= 5){
                start = false;
            }

            switch(ope){
                case 1:
                    result = x + y;
                    System.out.println("The sum of numbers is: "+ result);
                    break;
                case 2 :
                    result = x * y;
                    System.out.println("The multiply of numbers is: "+ result);
                    break;
                case 3:
                    result = x - y;
                    System.out.println("The subtraction of numbers is: "+ result);
                    break;
                case 4:
                    result = x / y;
                    System.out.println("The division of numbers is: "+ result);
                    break;
                default:
                    System.out.println("Enter a valid operation");
            }
        }

    }
}
