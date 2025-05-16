package day04;

public class TryCatch{

    public static void main(String[] args){


        final int number01 = 20;
        final int number02 = 50;


        try{
            int sum = number01 + number02;

            System.out.println("The result of sum is " +sum);
        }catch(ArithmeticException e){
            System.out.println("The sum is not pissible!");
            System.out.println(e);
        }

        try{

            int age = 20 / 2;

            String s = null;
            System.out.println(s.length());
        }catch(ArithmeticException e){
            System.out.println("cought ArithemeticException: "+ e);
        }
        catch(NullPointerException e){
            System.out.println(
                "Caught NullPointerException: " + e
            );
        }

    }
    
}
