package static_keyword;

public class Student {

    public static int id;

    public String name;
    private String lastname;

    public Student(String name, String lastname) {
        Student.id++;
        this.name = name;
        this.lastname = lastname;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
