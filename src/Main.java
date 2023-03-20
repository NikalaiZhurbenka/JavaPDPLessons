import java.sql.Timestamp;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // task 4.2
        Person Oleg = new Person();
        Oleg.name = "Игнашевич Олег";
        Oleg.age = 22;

        Oleg.move();

        Person Anton = new Person("Гранковский Aнтон", 22);
        Anton.talk();

        //Task 4.1

        Phone tel1 = new Phone(1, "iPhone", 250);
        Phone tel2 = new Phone(2, "Xaomi", 200);
        Phone tel3 = new Phone(3, "Samsung", 400);
        Phone tel4 = new Phone(3, "Apple");
        Phone tel5 = new Phone();

        System.out.println(tel1);
        System.out.println(tel2);
        System.out.println(tel3);

        tel1.recieveCall("Mama");
        tel2.recieveCall("papa");
        tel3.recieveCall("Sestra");

        tel1.getNumber("+375445159529");
        tel2.getNumber("+375293328618");
        tel3.getNumber("+375295854379");

        tel2.recieveCall("Papa", "+37544515952");

        tel4.sendMessage("+37544515952", "+37544515152");

        //task 4.4
        Library Person1 = new Library("Егор", "1", "матфак", "12.12.2000", "+495223422");
        Library Person2 = new Library("Олег", "2", "юрфак", "21.02.1990", "+255223422");
        Library Person3 = new Library("Антон", "3", "исторический", "29.02.1987", "+987223422");

        String[] Persons = new String[3];
        Persons[0] = Person1.toString();
        Persons[1] = Person2.toString();
        Persons[2] = Person3.toString();
        for (String person : Persons) {
            System.out.println(person);
        }

        Person2.takeBook(",Джава для чайников", "245");
        Person3.returnBook(",Джава для умных", "249");
        Person1.takeBook("Книга1", "Книга2", "Книга3", "Книга4", "Книга5", "Книга6");
        Person1.takeBook(true, "Книга1", "Книга2", "Книга3", "Книга4", "Книга5", "Книга6");


        Person1.takeBook(new Book("Капитанская дочка", "Пушкин А.С."), new Book("Война и мир", "Толстой Л.Н."), new Book("Смерть поэта", "Лермонтов М.Ю"));
        Person1.returnBook(new Book("Капитанская дочка", "Пушкин А.С."), new Book("Война и мир", "Толстой Л.Н."), new Book("Смерть поэта", "Лермонтов М.Ю"));
        Matrix m = new Matrix(3, 3);
        Matrix.outputMatrix(m);
        Matrix m2 = new Matrix(3, 3);
        Matrix.outputMatrix(m2);
        Matrix.outputMatrix(m.summMatrix(m2));
        Matrix.outputMatrix(m.multiplyMatrix(5));
        Matrix.outputMatrix(m.multiplyMatrixByMatrix(m2));
    }
}