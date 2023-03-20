public class Person {
    String name;
    int age;

    public void move() {
        System.out.println("Person with name " + name + " and age " + age + " walk");
    }

    public void talk() {
        System.out.println("Person with name " + name + " and age " + age + " talk ");
    }

    Person() {
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
