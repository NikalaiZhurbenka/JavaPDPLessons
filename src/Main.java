import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    Person Oleg = new Person();
    Oleg.name = "Игнатьев Олег";
    Oleg.age = 22;

    Oleg.move();

    Person Anton = new Person("Гранковский Aнтон",22);
    Anton.talk();


    }
}