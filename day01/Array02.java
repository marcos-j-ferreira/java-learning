package day01;

class Student{
    public String name;

    Student(String name){
        this.name = name;

    }

    @Override
    public String toString(){
        return name;
    }
}

public class Array02 {
    public static void main(String[] args){

        Student[] myStudents = new Student[]{
            new Student("marocos"), new Student("luiz")
        };

        for(Student i: myStudents){
            System.out.println(i);
        }
    }
}
