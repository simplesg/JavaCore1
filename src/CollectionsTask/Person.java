package CollectionsTask;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person> {
    private String name;
    private int age;
    private String hobby;
    private double weight;

    public Person(String name, int age, String hobby, double weight) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //compareTo Age using Comparable interface
    @Override
    public int compareTo(Person o) {
        if (this.age == o.age)
            return 0;
        else if (this.age < o.age) {
            return -1;
        }
        return 1;
    }

    @Override
    public String toString() {
        return "Person:{ Name: " + this.name + ";  Age: " + this.age + "; Weight: " + this.weight;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person person = (Person) o;
            return person.weight == this.weight && person.name.equals(this.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

}
