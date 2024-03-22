package FindPerson;

// Класс, представляющий адрес
class Address {
    String street;
    String city;

    Address(String street, String city) {
        this.street = street;
        this.city = city;
    }
}

// Класс, представляющий человека
class Person {
    String name;
    String surname;
    int birthYear;
    Address address;

    Person(String name, String surname, int birthYear, Address address) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.address = address;
    }

}

//    Напишите программу «Адрес человека». Есть сущность Человек,
//    которая связана с сущностью Адрес. Считается, что у каждого человека
//    есть только один адрес. Организовать массив объектов Человек (не менее 4) и по массиву:
//• осуществить поиск Человека по фамилии;
//• осуществить поиск человека по атрибуту адреса;
//• вывести людей, родившихся между определенными датами;
//• найти самого старого (молодого);
//• найти людей, проживающих на одной улице.
public class AddressOfHuman {
    public void SearchBySurname(String surname) {

    }

    public static void Print(Person person) {
        System.out.print("Найден\nИмя : " + person.name +
                "\nФамилия : " + person.surname + "\nГод Рождения : " +
                person.birthYear + "\nАдрес : " + person.address.city + " " + person.address.street +
                "\n--------------------------------------\n\n");

    }

    public static void main(String[] args) {
//Создание списка объектов класса Person
//        List<Person> people = new ArrayList<>();
//        people.add(new Person("Иван", "Иванов", 1999, new Address("Пушкина", "Тольятти")));
//        people.add(new Person("Петр", "Петров", 2000, new Address("Ленина", "Санкт-Петербург")));
//        people.add(new Person("Анна", "Сидорова", 2002, new Address("Толстого", "Москва")));
//        people.add(new Person("Елена", "Козлова", 2004, new Address("Пушкина", "Тольятти")));

        Person[] people = {
                new Person("Иван", "Иванов", 1999, new Address("Пушкина", "Тольятти")),
                new Person("Петр", "Петров", 2000, new Address("Ленина", "Санкт-Петербург")),
                new Person("Анна", "Сидорова", 2002, new Address("Толстого", "Москва")),
                new Person("Елена", "Козлова", 2004, new Address("Пушкина", "Тольятти"))};

        //поиск по фамилии
        String searchSurname = "Петров";
        for (Person person : people) {
            if (person.surname.equals(searchSurname)) {
                System.out.println("Человек по фамилии " + searchSurname);
                Print(person);
            }
        }


        String addressAttribute = "Пушкина";
        for (Person person : people) {
            if (person.address.street.equals(addressAttribute) || person.address.city.equals(addressAttribute)) {
                System.out.println("Человек с атрибутом адреса " + addressAttribute);
                Print(person);
            }
        }

        int firstYear = 1980;
        int secondYear = 2000;
        for (Person person : people) {
            if (person.birthYear >= firstYear && person.birthYear <= secondYear) {
                System.out.println("Человек родившийся между " + firstYear + " и " + secondYear);
                Print(person);
            }
        }


        Person oldestPerson = people[0];
        Person youngestPerson = people[0];
        for (Person person : people) {
            if (person.birthYear < oldestPerson.birthYear) {
                oldestPerson = person;
            }
            if (person.birthYear > youngestPerson.birthYear) {
                youngestPerson = person;
            }

        }
        System.out.println("Самый старший человек: " + oldestPerson.name + " " + oldestPerson.surname + " (" + oldestPerson.birthYear + " г.р.)");
        System.out.println("Самый молодой человек: " + youngestPerson.name + " " + youngestPerson.surname + " (" + youngestPerson.birthYear + " г.р.)\n" +
                "--------------------------------------\n\n");


        String searchSameStreet = "Пушкина";
        System.out.println("Люди, проживающие на улице " + searchSameStreet + ":");
        for (Person person : people) {
            if (person.address.street.equals(searchSameStreet)) {
                System.out.println(person.name + " " + person.surname);
            }

        }

    }
}

