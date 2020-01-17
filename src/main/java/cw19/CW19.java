package cw19;

import java.util.Arrays;

public class CW19 {
    public static void main(String[] args) {
        Person person = new Person("a", 1991);
        Person person2 = new Person("b", 1993);
        Person person3 = new Person("c", 1995);
        Person person4 = new Person("d", 2001);
        Person person5 = new Person("e");
        Person olderPerson = Person.getOlderPerson(Arrays.asList(person, person2, person3, person4,person5));
        System.out.println(olderPerson);
    }
}
