import Lesson4_1.Phone;
import Lesson4_2.Person;
import Lesson4_3.Matrix;
import Lesson4_4.Book;
import Lesson4_4.Library;
import Lesson7_1.Students;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // task 4.2
        Person Oleg = new Person();
        Oleg.name = "Ignashevich Oleg";
        Oleg.age = 22;

        Oleg.move();

        Person Anton = new Person("Grankovski Anton", 22);
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
        tel2.recieveCall("Father");
        tel3.recieveCall("Sister");

        tel1.getNumber("+375445159529");
        tel2.getNumber("+375293328618");
        tel3.getNumber("+375295854379");

        tel2.recieveCall("Papa", "+37544515952");

        tel4.sendMessage("+37544515952", "+37544515152");

        //task 4.4
        Library Person1 = new Library("Egor", "1", "math", "12.12.2000", "+495223422");
        Library Person2 = new Library("Oleg", "2", "history", "21.02.1990", "+255223422");
        Library Person3 = new Library("Anton", "3", "history", "29.02.1987", "+987223422");

        String[] Persons = new String[3];
        Persons[0] = Person1.toString();
        Persons[1] = Person2.toString();
        Persons[2] = Person3.toString();
        for (String person : Persons) {
            System.out.println(person);
        }

        Person2.takeBook(",Java lessons lvl1", "245");
        Person3.returnBook(",Java lessons lvl2", "249");
        Person1.takeBook("Book1", "Book2", "Book3", "Book4", "Book5", "Book6");
        Person1.takeBook(true, "Book1", "Book2", "Book3", "Book4", "Book5", "Book6");


        Person1.takeBook(new Book("Test1", "Puschkin A.S"), new Book("War and Piece", "Tolstoi L.N."), new Book("Test3", "Lermontov M.U."));
        Person1.returnBook(new Book("Test1", "Puschkin A.S"), new Book("War and Piece", "Tolstoi L.N."), new Book("Test3", "Lermontov M.U."));

        //task 4.3
        Matrix m = new Matrix(3, 3);
        Matrix.outputMatrix(m);
        Matrix m2 = new Matrix(3, 3);
        Matrix.outputMatrix(m2);
        Matrix.outputMatrix(m.summMatrix(m2));
        Matrix.outputMatrix(m.multiplyMatrix(5));
        Matrix.outputMatrix(m.multiplyMatrixByMatrix(m2));


        //task 7.1
        ArrayList<Students> students = new ArrayList<>();
        students.add(new Students("Oleg", "Plushkin", 11));
        students.add(new Students("Oleg1", "Plushkin", 23));
        students.add(new Students("Oleg2", "Plushkin", 42));
        students.add(new Students("Oleg3", "Plushkin", 55));
        students.add(new Students("Oleg4", "Plushkin", 62));
        students.add(new Students("Oleg5", "Plushkin", 20));
        students.add(new Students("Artem", "Cringevsky", 33));
        if (students.get(1).age == students.get(0).age) {
            System.out.println("Student" + students.get(0).name + " have same age as " + students.get(1).name);
        } else {
            System.out.println("Lesson7_1.Students have differ name");
        }

        Students studentforTest = new Students("Artem", "Cringevsky", 33);
        int g = students.indexOf(studentforTest);
        if (g == -1) {
            students.add(studentforTest);
            System.out.println("Student added");
        } else {
            System.out.println("Student already exists. Index: " + g);
        }
    }
}