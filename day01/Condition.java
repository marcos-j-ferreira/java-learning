package day01;
import java.util.Scanner;

public class Condition {

    public void if_(int x){

        if(x >= 18){
            System.out.println("You are of legal age");
        }else{
            System.out.println("You are a minor");
        }

    }

    void switch_(int x){

        switch(x){
            case 1:
                System.out.println("Your letter is first of alphabet, your letter is A");
                break;
            case 2: 
                System.out.println("Your letter is second of alphabet, your letter is B");
                break;
            case 3:
                System.out.println("Your letter is third of alphabet, your letter is C");
                break;
            case 4:
                System.out.println("Your letter is fourth of alphabet, your letter is D");
                break;
            case 5:
                System.out.println("Your letter is fifth of alphabet, your letter is E");
                break;
            case 6:
                System.out.println("Your letter is sixth of alphabet, your letter is F");
                break;
            case 7:
                System.out.println("Your letter is seventh of alphabet, your letter is G");
                break;
            case 8:
                System.out.println("Your letter is eighth of alphabet, your letter is H");
                break;
            case 9:
                System.out.println("Your letter is ninth of alphabet, your letter is I");
                break;
            case 10:
                System.out.println("Your letter is tenth of alphabet, your letter is J");
                break;
            case 11:
                System.out.println("Your letter is eleventh of alphabet, your letter is K");
                break;
            case 12:
                System.out.println("Your letter is twelfth of alphabet, your letter is L");
                break;
            case 13:
                System.out.println("Your letter is thirteenth of alphabet, your letter is M");
                break;
            case 14:
                System.out.println("Your letter is fourteenth of alphabet, your letter is N");
                break;
            case 15:
                System.out.println("Your letter is fifteenth of alphabet, your letter is O");
                break;
            case 16:
                System.out.println("Your letter is sixteenth of alphabet, your letter is P");
                break;
            case 17:
                System.out.println("Your letter is seventeenth of alphabet, your letter is Q");
                break;
            case 18:
                System.out.println("Your letter is eighteenth of alphabet, your letter is R");
                break;
            case 19:
                System.out.println("Your letter is nineteenth of alphabet, your letter is S");
                break;
            case 20:
                System.out.println("Your letter is twentieth of alphabet, your letter is T");
                break;
            case 21:
                System.out.println("Your letter is twenty-first of alphabet, your letter is U");
                break;
            case 22:
                System.out.println("Your letter is twenty-second of alphabet, your letter is V");
                break;
            case 23:
                System.out.println("Your letter is twenty-third of alphabet, your letter is W");
                break;
            case 24:
                System.out.println("Your letter is twenty-fourth of alphabet, your letter is X");
                break;
            case 25:
                System.out.println("Your letter is twenty-fifth of alphabet, your letter is Y");
                break;
            case 26:
                System.out.println("Your letter is twenty-sixth of alphabet, your letter is Z");
                break;
            default:
                System.out.println("Your letter is not in alphabet");
        }
    }

    public static void main(String[] args){

        // || ->  or  = One condition have to be true for it to be true
        // &&  -> and = both conditions have to be true for it to be true
        // !(n == 1) -> not = true if n is NOT 1
        // !=   ->  different, if the condition is not equal


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age:");
        int x = sc.nextInt();

       Condition _if_ = new Condition(); 
       _if_.if_(x);

       System.out.println("Choose a number of letters in the alphabet between 1 and 26");
       System.out.println("Enter a number of a letter of the alphabet:");
       int y = sc.nextInt();

       Condition cond = new Condition();
       cond.switch_(y);

    }
    
}
