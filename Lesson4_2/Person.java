package Lesson4_2;

public class Person {
    public String name;
    public int age;

    public void move() {
        System.out.println("Lesson4_2.Person with name " + name + " and age " + age + " walk");
    }

    public void talk() {
        System.out.println("Lesson4_2.Person with name " + name + " and age " + age + " talk ");
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
