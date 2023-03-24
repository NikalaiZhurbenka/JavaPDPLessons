package Task7_3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Line7_3 {
    public static void main(String[] args) {
        System.out.println("Enter any numbers 1 2 3 4 5 12 135 23 ): ");
        String numbers = new Scanner(System.in).nextLine();
        Set<String> SetLine = new HashSet<String>();
        SetLine.addAll(Arrays.asList(numbers.split(" ")));
        System.out.println(SetLine);

    }
}
