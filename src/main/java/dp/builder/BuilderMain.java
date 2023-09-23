package dp.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Person p = Person.builder()
                .firstname("Ali")
                .x("")
                .build();
    }
}
