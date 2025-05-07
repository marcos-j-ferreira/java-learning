package day01;

public class Loops {


    public void loops_(){
        for(int i = 0; i <=5; i++){
            System.out.println(i + " ");
        }
        for(int i = 5; i >= 0; i--){
            System.out.println(i + "  ");
        }
    }
    
    public void while_(){

        int i = 0;
        while( i <= 10){
            System.out.println(i + " ");
            i++;
        }

        int n = 10;
        while (n >= 0){
            System.out.println(n + " ");
            n--;
        }
    }

    void doWhile_(){

        int i = 0;

        do{
            System.out.println(i +" ");
            i++;
        }while(i <= 10);
    }

    public static void main(String[] args){
        
       Loops f = new Loops();
       f.loops_();

       String[] color = {"blue", "red","orange"};

       for (String i: color){
        System.out.println("color: " + i);
       }

       Loops w= new Loops();
       w.while_();

       Loops d = new Loops();
       d.doWhile_();


    }
}
