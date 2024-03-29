package Person;

public class PersonMove {
    public static void main(String[] args) {
        Person person1 = new Person("Данила", 22);
        Person person2 = new Person();

        person1.talk();

        person2.move();
    }
}
