import comparators.AgeComparator;
import comparators.NameComparator;
import domain.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        treeSetPersoane();
    }

    private static void treeSetPersoane() {

        Set<Person> newPerson = new TreeSet<>(new NameComparator());

        Person p1 = new Unemployed("Pop Radu", "15411303456789", 65);
        Person p2 = new Student("Popescu Radu", "19411303456789", 25);
        Person p3 = new Employee("An Ana", "27411303456789", 45);
        Person p4 = new Student("Popescu Radu", "19411303456789", 25);

        newPerson.add(p1);
        newPerson.add(p2);
        newPerson.add(p3);
        newPerson.add(p4);

        System.out.println('\n' + "Sort by name: ");

        for (Person person : newPerson)
            System.out.println(person.getName() + " " + person.getAge());

        Set<Person> newPersonA = new TreeSet<>(new AgeComparator());

        Person p1A = new Unemployed("Pop Radu", "15411303456789", 65);
        Person p2A = new Student("Popescu Radu", "19411303456789", 25);
        Person p3A = new Employee("An Ana", "27411303456789", 45);

        newPerson.add(p1A);
        newPerson.add(p2A);
        newPerson.add(p3A);

        System.out.println('\n'+"Sort by age: ");

        for (Person person : newPerson)
            System.out.println(person.getName() + " " + person.getAge());

        List<Address> addressesList = new ArrayList<>();

        Address a1 = new Address("Romania", "Cluj", "Cluj-Napoca", "Iazului", 3, "405555");
        Address a2 = new Address("Romania", "Sibiu", "Sibiu", "Arinilor", 3, "405855");

        addressesList.add(a1);
        addressesList.add(a2);

        List<Hobby> hobbiesList1 = new ArrayList<>();

        Hobby h1 = new Hobby("inot", 3, Collections.singletonList(a1));
        Hobby h2 = new Hobby("tenis", 2, Collections.singletonList(a2));

        hobbiesList1.add(h1);
        hobbiesList1.add(h2);

        Map<Person, List<Hobby>> hobbiesPersons = new HashMap<>();
        hobbiesPersons.put(p1, hobbiesList1);

        System.out.println('\n' + "Hobbyurile persoanei "+ p1.getName()+" sunt:");
        System.out.println();
        for (List<Hobby> hobbiesList : hobbiesPersons.values()) {
            for (int i = 0; i <= hobbiesList1.size(); i++) {
                System.out.println(hobbiesList1.get(i).getNameH());
                System.out.println(hobbiesList1.get(i).getAddressesList());
            }

        }
    }
}

