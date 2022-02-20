package design._05_prototype.java;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {

    public static void main(String[] args) {
        Student junwoo1027 = new Student("junwoo1027");
        Student junwoo = new Student("junwoo");
        List<Student> students = new ArrayList<>();
        students.add(junwoo);
        students.add(junwoo1027);

        List<Student> clone = new ArrayList<>(students);
        System.out.println(clone);
    }
}
