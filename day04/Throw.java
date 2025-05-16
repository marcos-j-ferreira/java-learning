package day04;

public class Throw {

    public static void main(String[] args){

        int age = 23;

        if (age < 18){
            throw new IllegalArgumentException("Tou must be at least 18 years old.");
        }
        System.out.println("Access granted.");
    }

    
}
