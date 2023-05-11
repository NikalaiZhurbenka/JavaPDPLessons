package Lesson4_1;

public class Phone {
    public int number;
    public String model;
    public int weight;

    //without parameters
    public Phone() {
    }

    //with 2 parameters
    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //with 3 parameters
    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }


    Phone(int number, int weight, String model) {
        this(number, model);
        this.weight = weight;
    }

    public String toString() {
        return "{Number:" + number + " Model:" + model + " Weight: " + weight;
    }

    public void recieveCall(String Name) {
        System.out.println("Call:" + Name);
    }

    public void getNumber(String phoneNumber) {
        System.out.println("Lesson4_1.Phone number:" + phoneNumber);
    }

    public void recieveCall(String Name, String number) {
        System.out.println("Call:" + Name + number);
    }

    public void sendMessage(String... numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

}
