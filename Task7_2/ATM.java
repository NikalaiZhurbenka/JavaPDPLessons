package Task7_2;

import Exceptions.AmountPositiveValue;
import Exceptions.AtmStepsException;
import Exceptions.CurrencyException;
import Exceptions.InvalidValletType;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        ATM user = new ATM();
        boolean flag = true;
        do
            try {
                System.out.println("Choose operation (1-5): \n 1)Check Balance \n 2)Make a deposit \n 3)Take money \n 4)Task7_2.Currency exchange rate information \n 5)Exit ");
                Scanner n = new Scanner(System.in);
                switch (n.nextLine()) {
                    case "1":
                        System.out.println("Choose type of currency");
                        user.vallet();
                        user.getUserBalance(n.nextLine());
                        break;
                    case "2":
                        System.out.print("You current balance is: ");
                        user.getUserBalance();
                        System.out.println("Choose type of currency and amount to add");
                        user.vallet();
                        System.out.print("\nEnter currency type: ");
                        String type = n.nextLine();
                        System.out.print("\nEnter Amount of money: ");
                        double amount = n.nextDouble();
                        user.deposit(amount, type);
                        break;
                    case "3":
                        System.out.print("You current balance is: ");
                        user.getUserBalance();
                        System.out.println("Choose type of currency and amount to add");
                        user.vallet();
                        System.out.print("\nEnter currency type: ");
                        String type1 = n.nextLine();
                        System.out.print("\nEnter Amount of money: ");
                        double amount1 = n.nextDouble();
                        user.withdraw(amount1, type1);
                        break;
                    case "4":
                        System.out.println("Exchange rate (USD/Other currency):");
                        user.exchangeRate();
                        break;
                    case "5":
                        flag = false;
                        break;
                    default:
                        throw new AtmStepsException();
                }
            } catch (AmountPositiveValue ex) {
                System.out.println("Amount of money must be only positive value");
            } catch (AtmStepsException ex) {
                System.out.println("Incorrect choose. Choose from 1 to 5");
            } catch (CurrencyException ex) {
                System.out.println("Not enough money on yours balance");
            } catch (InvalidValletType ex) {
                System.out.println("This type of currency not exists");
            } catch (InputMismatchException ex) {
                System.out.println("For text fields you should use text. For numbers - numbers.....");
            }

        while (flag);

    }

    public ATM() {
        ATM_values();
    }

    Map<String, Double> transferCourse = new HashMap<>();
    private Double balance = 2.00;

    public void ATM_values() {
        transferCourse.put("USD", 1.0);
        transferCourse.put("EUR", 1.2);
        transferCourse.put("GBP", 1.1);
        transferCourse.put("AUD", 0.8);
        transferCourse.put("NZD", 0.9);
        transferCourse.put("CAD", 0.7);
        transferCourse.put("CHF", 2.2);
        transferCourse.put("JPY", 20.0);
    }

    public void getUserBalance() throws InvalidValletType {
        getUserBalance("USD");
    }

    public void vallet() {
        for (String str : this.transferCourse.keySet()) {
            System.out.print(str + ",");
        }
        System.out.println();
    }

    public void exchangeRate() {
        for (Map.Entry<String, Double> transferOut : this.transferCourse.entrySet()) {
            System.out.println(transferOut.getKey() + " : " + transferOut.getValue());
        }
    }

    public void getUserBalance(String exchange) throws InvalidValletType {
        if (transferCourse.get(exchange) == null) {
            throw new InvalidValletType();
        }
        System.out.println(balance * transferCourse.get(exchange) + " " + exchange);
    }


    public void deposit(double amount, String exchange) throws InvalidValletType, AmountPositiveValue {
        if (transferCourse.get(exchange) == null) {
            throw new InvalidValletType();
        }
        if (amount <= 0) {
            throw new AmountPositiveValue();
        }
        balance += amount / transferCourse.get(exchange);
        System.out.println("after this operation your balance is: " + balance + "USD");
    }

    public void withdraw(double amount, String exchange) throws CurrencyException, InvalidValletType, AmountPositiveValue {
        if (transferCourse.get(exchange) == null) {
            throw new InvalidValletType();
        }
        if (amount <= 0) {
            throw new AmountPositiveValue();
        }
        if (balance - amount / transferCourse.get(exchange) > 0) {
            balance -= amount / transferCourse.get(exchange);
        } else {
            throw new CurrencyException();
        }


        System.out.println("after this operation your balance is: " + balance + "USD");
    }
}
