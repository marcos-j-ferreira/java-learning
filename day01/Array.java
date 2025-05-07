package day01;


class Nome{
        
    public int age;

    Nome(int age){
        this.age = age;
    }
    
}

public class Array {

    void basic(){

        int[] arr = {1,2,3,4,5};
        //type[]arrayname

        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

    }

    void size(){

        int[] number = new int[10];
        int size = number.length;
        System.out.println(size);
        //output 10

    }

    void element(){

        int[] number = new int [5];

        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;

        for(int i = 0; i <= 4; i++){

            System.out.println(number[i]);
        }
    }

    
    void multiDimArray(){

        int[][] number = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        for(int i = 0; i <= 2; i++){

            for(int j = 0; j <= 2; j++){
                System.out.println(number[i][j]);
            }
        }
    }

    public static void main(String[] args){

        Nome[] arr;

        arr = new Nome[2];

        arr[0] = new Nome(20);
        arr[1] = new Nome(18);

        for(int i = 0; i < arr.length; i++){
            System.out.println("Element at "+ i +" :{ " + arr[i].age+ " }");
        }


    }
    
}
