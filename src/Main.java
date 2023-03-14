import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
   // task 4.2
    Person Oleg = new Person();
    Oleg.name = "Игнашевич Олег";
    Oleg.age = 22;

    Oleg.move();

    Person Anton = new Person("Гранковский Aнтон",22);
    Anton.talk();

    //Task 4.1

        Phone tel1 = new Phone(1,"iPhone",250);
        Phone tel2 = new Phone(2, "Xaomi", 200);
        Phone tel3 = new Phone (3, "Samsung", 400);
        Phone tel4 = new Phone (3, "Apple");
        Phone tel5 = new Phone ();

        System.out.println(tel1);
        System.out.println(tel2);
        System.out.println(tel3);

        tel1.recieveCall("Mama");
        tel2.recieveCall("papa");
        tel3.recieveCall("Sestra");

        tel1.getNumber("+375445159529");
        tel2.getNumber("+375293328618");
        tel3.getNumber("+375295854379");

        tel2.recieveCall("Papa","+37544515952");

        tel4.sendMessage("+37544515952", "+37544515152");

    }
}