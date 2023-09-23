package dp.builder;

public class Person {

    private String firstname;
    private String lastname;
    private int age;

    private String address;

    private String x;

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }
}

class PersonBuilder {

    private final Person person = new Person();

    public PersonBuilder address(String adr) {
        person.setAddress(adr);
        return this;
    }

    public PersonBuilder x(String x) {
        person.setX(x);
        return this;
    }

    public PersonBuilder firstname(String fn) {
        person.setFirstname(fn);
        return this;
    }
    public PersonBuilder lastname(String ln) {
        person.setLastname(ln);
        return this;
    }
    public PersonBuilder age(int age) {
        person.setAge(age);
        return this;
    }

    public Person build() {
        return person;
    }
}
