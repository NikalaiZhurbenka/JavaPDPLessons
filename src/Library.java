import java.util.Date;

public class Library {
    String studentName;
    String ID;
    String department;
    String dateOfBirth;
    String phone;


    Library(String studentName, String ID, String department, String dateOfBirth, String phone){
        this.studentName = studentName;
        this.ID = ID;
        this.department = department;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;

    }
//    Library(String BookName, String BookID){
//
//        this.BookName = BookName;
//        this.BookID = BookID;
//   }
    Library(){

    }


    public String toString() {
        return "Name:" + studentName + " StudentID:" + ID + " Where Studing: " + department + " Date of Birthday: " + dateOfBirth + " Phone: " + phone;
    }

    public void takeBook(String BookName,String BookID){
        System.out.println("Person with ID: "+ID + " Take book. Book ID and Name: "+ BookID + " " + BookName);
    }

    public void takeBook(String ...Books){
       System.out.println("Студент: " + studentName + " Взял " + Books.length + " книг" );
   }
    public void takeBook(boolean test,String ...ListBooks){

        StringBuilder endString = new StringBuilder();
        for(int i = 0; i < ListBooks.length;i++){
        endString.append(ListBooks[i]+",");
        }
        System.out.println(endString);
    }
    public void takeBook(Book ...NameBooks){
        StringBuilder endString = new StringBuilder();
        for(int i = 0; i < NameBooks.length;i++){
            endString.append(NameBooks[i]+",");
        }
        System.out.println(studentName + " взял книги: "+ endString);
    }
    public void returnBook(String BookName,String BookID){
        System.out.println("Person with ID: "+ID + " Return book. Book ID and Name: "+ BookID + " " + BookName);
    }
    public void returnBook(Book ...NameBooks) {
        System.out.println(studentName + " вернул " +NameBooks.length+ " книги: ");
    }
}
