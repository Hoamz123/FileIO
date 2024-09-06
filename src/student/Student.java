package student;

import java.io.Serializable;
import java.util.Scanner;

public class Student implements Serializable {
    private final int id;
    private final String name;
    private final int age;


    public Student(Scanner sc){
        this.name = sc.nextLine();
        this.age = sc.nextInt();
        this.id = sc.nextInt();
        sc.nextLine();//chong troi lenh
    }

    @Override
    public String toString() {
        return  this.name + " " + this.age + " " + this.id + "\n";
    }
}
