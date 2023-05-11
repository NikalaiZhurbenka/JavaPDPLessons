package Task7_3;

import java.util.*;

public class Line7_3 {
    public static void main(String[] args) {
        System.out.println("Enter  numbers: 1 2 3 4 5 12 135 23 - For example");
        String numbers = new Scanner(System.in).nextLine();
        Set<Integer> SetLine = new HashSet<Integer>();
        String[] test1 = numbers.split(",");
        int i = 0;
        try {
            for (i=0; test1.length > i; i++) {
                SetLine.add(Integer.parseInt(test1[i]));
            }
            System.out.println(SetLine);
        }catch (NumberFormatException ex){
            System.out.println("Incorrect type. Should be only Int values. Incorrect value - '"+test1[i]+"'");

        }
    }
}
