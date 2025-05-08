package day01;
import java.util.*;

class Student{
    public String name;

    Student(String name){
        this.name = name;

    }

    @Override
    public String toString(){
        return name;
    }

    void subclass(){
        Student[] myStudents = new Student[]{
            new Student("marocos"), new Student("luiz")
        };

        for(Student i: myStudents){
            System.out.println(i);
        }
    }

    void copy(){

        int[] array = {1,2,3,4,5};

        int[] cloneArray = array.clone();

        System.out.println(array == cloneArray);

        for(int i = 0; i < cloneArray.length;i++){
            System.out.println(cloneArray[i]);
        }

    }
}

public class Array02 {
    public static void main(String[] args){

        int[] arr = {9,5,7,1,3};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        // ordenar uma array, e trasnformar ela em string para não usar loops

        int[] binary = {1,2,3,4,5};

        int index = Arrays.binarySearch(binary, 5);

        System.out.println("Index encontrado no index: "+index);

        int [] copy = Arrays.copyOf(binary, index);

        System.out.println(Arrays.toString(copy));

        int[] fill = new int[5];

        Arrays.fill(fill, 7);

        System.out.println(Arrays.toString(fill));
    }
}
