package domain;

import java.util.Objects;

public class Person {
    private String name;
    private String cnp;
    private int age;

    Person(String name, String cnp, int age) {
        this.name = name;
        this.cnp = cnp;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", cnp='" + cnp + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName()) &&
                getCnp().equals(person.getCnp());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getCnp(), getAge());
    }
}
