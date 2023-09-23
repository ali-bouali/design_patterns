package static_keyword;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Wael", "Hasnaoui"));
        students.add(new Student("Yassmin", "Zaag"));


        students.forEach(s -> {
            System.out.println(Student.id);
            System.out.println(s);
        });

    }
}
