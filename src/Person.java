public class Person {
    String name;
    int age;

    public void move(){
    System.out.println("Человек с именем " + name +" и возрастом " + age + " идёт");
    }

    public void talk(){
    System.out.println("Человек с именем " + name +" и возрастом " + age + " говорит");
    }

     Person(){}

     Person(String name, int age){
        this.name = name;
        this.age = age;
    }
}
