package cw19;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private int yearOfBirth;
    private String number;


    public Person(String name) {
        this.name = name;
        yearOfBirth = 1990;
    }

    public Person(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public static Person getOlderPerson(Person o1, Person o2) {
        return o1.getYearOfBirth() > o2.getYearOfBirth() ? o1 : o2;
    }

    public static Person getOlderPerson(List<Person> personList) {
        return personList.stream().min(Comparator.comparingInt(Person::getYearOfBirth)).get();
    }
}
