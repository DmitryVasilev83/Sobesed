package les2.builder;

public class App {

    public static void main(String[] args) {
        Person person = Person.createBuilder()
                .withFirstName("qqq")
                .withAge(20)
                .build();

        System.out.println(person.getFirstName());
    }
}
