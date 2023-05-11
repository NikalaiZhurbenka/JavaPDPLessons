package Lesson4_4;

import Lesson4_4.Book;

public class Library {
    String studentName;
    String ID;
    String department;
    String dateOfBirth;
    String phone;


    public Library(String studentName, String ID, String department, String dateOfBirth, String phone) {
        this.studentName = studentName;
        this.ID = ID;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;

    }

    //    Lesson4_4.Library(String BookName, String BookID){
//
//        this.BookName = BookName;
//        this.BookID = BookID;
//   }
    Library() {

    }


    public String toString() {
        return "Name:" + studentName + " StudentID:" + ID + " Where Studing: " + department + " Date of Birthday: " + dateOfBirth + " Lesson4_1.Phone: " + phone;
    }

    public void takeBook(String BookName, String BookID) {
        System.out.println("Lesson4_2.Person with ID: " + ID + " Take book. Lesson4_4.Book ID and Name: " + BookID + " " + BookName);
    }

    public void takeBook(String... Books) {
        System.out.println("Student: " + studentName + " Take " + Books.length + " Books");
    }

    public void takeBook(boolean test, String... ListBooks) {

        StringBuilder endString = new StringBuilder();
        for (int i = 0; i < ListBooks.length; i++) {
            endString.append(ListBooks[i] + ",");
        }
        System.out.println(endString);
    }

    public void takeBook(Book... NameBooks) {
        StringBuilder endString = new StringBuilder();
        for (int i = 0; i < NameBooks.length; i++) {
            endString.append(NameBooks[i] + ",");
        }
        System.out.println(studentName + " Take books: " + endString);
    }

    public void returnBook(String BookName, String BookID) {
        System.out.println("Lesson4_2.Person with ID: " + ID + " Return book. Lesson4_4.Book ID and Name: " + BookID + " " + BookName);
    }

    public void returnBook(Book... NameBooks) {
        System.out.println(studentName + " return " + NameBooks.length + " books: ");
    }
}
