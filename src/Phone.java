public class Phone {
    public int number;
    public String model;
    public int weight;

    //Конструктор без параметров
    Phone() {
    }

    //конструктор с 2 параметрами
    Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    //конструктор с тремя параметрами
    Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    // конструктор с 2 параметрами из конструктора с 3 параметрами
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
        System.out.println("Phone number:" + phoneNumber);
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
