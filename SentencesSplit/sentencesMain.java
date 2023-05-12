package SentencesSplit;

import java.util.Scanner;
import java.util.regex.Pattern;

public class sentencesMain {
    static Scanner userOption = new Scanner(System.in);
    static String first;
    static String second;

    static int wordsCountTotal;
    static int wordsCountFirst;
    static int wordsCountSecond;
    static String firstStringSymbols;
    static String secondStringSymbols;
    static int totalRowSymbols;
    static String twoInOne;

    public static void main(String[] Args) throws InterruptedException, NullPointerException {
        boolean flag = true;

        do {
            System.out.println("\nChoose option:\n -[1] Create sentences: \n -[2] Start again: \n -[3] Get amount of words in sentences: \n -[4] Get amount of symbols in sentences: \n -[5] Remove  punctuation and spaces: \n -[6] Exit program");
            switch (userOption.nextLine()) {
                case "1":
                    if (first == null || second == null) {
                        Scanner firstSentence = new Scanner(System.in);
                        Scanner secondSentence = new Scanner(System.in);
                        System.out.println("Enter First sentence");
                        first = firstSentence.nextLine();
                        if (first.length() > 200) {
                            first = null;
                            System.out.println("Max symbols amount is 200");
                            break;
                        }
                        System.out.println("Enter Second sentence");
                        second = secondSentence.nextLine();
                        if (second.length() > 200) {
                            second = null;
                            System.out.println("Max symbols amount is 200");
                            break;
                        }
                    } else {
                        System.out.println("sentence already exists");
                        break;
                    }
                    System.out.println("\nResult of first sentence\n" + first);
                    System.out.println("Result of second sentence:\n" + second);

                    thread1 firstThread = new thread1();
                    firstThread.start();
                    try {
                        firstThread.join();
                    } catch (NullPointerException e) {
                        throw new RuntimeException(e);
                    }
                    thread2 secondThread = new thread2();
                    secondThread.start();
                    try {
                        secondThread.join();
                    } catch (NullPointerException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "2":
                    if (first == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    System.out.println("\nFirst sentence:\n" + first);
                    System.out.println("Second sentence:\n" + second);
                    System.out.println("\nDo you really wanna delete sentences?\n Choose Y/N");
                    String deletingSentences = userOption.nextLine();
                    if (deletingSentences.equals("Y")) {
                        first = null;
                        second = null;
                        System.out.println("Sentences successfully removed");
                        break;
                    } else if (deletingSentences.equals("N")) {
                        System.out.println("Sentence deleting canceled");
                    } else {
                        System.out.println("You choose incorrect operation. Try again.");
                    }
                    break;

                case "3":
                    if (first == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    System.out.println("Words amount in first sentence: " + wordsCountFirst);

                    if (second == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    System.out.println("Words amount in second sentence: " + wordsCountSecond);
                    wordsCountTotal = wordsCountFirst + wordsCountSecond;
                    System.out.println("Total words count: " + wordsCountTotal);

                    System.out.println("");
                    break;
                case "4":
                    if (first == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    if (second == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    System.out.println("First row lenght: " + firstStringSymbols.length());
                    System.out.println("First row lenght: " + secondStringSymbols.length());
                    totalRowSymbols = firstStringSymbols.length() + secondStringSymbols.length();
                    System.out.println("Total symbols count: " + totalRowSymbols);
                    System.out.println("");
                    break;
                case "5":
                    if (first == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }
                    if (second == null) {
                        System.out.println("Strings are empty. Create sentences first");
                        break;
                    }

                    twoInOne = first.replaceAll("[^\\w\\s]", "") + " " + second.replaceAll("[^\\w\\s]", "");

                    System.out.println("Two in one row (removing punctuation): " + twoInOne);
                    break;
                case "6":
                    System.out.println("Connection lost");
                    System.exit(0);
            }
        }
        while (flag = true);

    }

    static class thread1 extends Thread {
        public void run() {
            //Words in rows
            if (first.length() != 0) {
                wordsCountFirst = 1;
                for (int i = 0; i < first.length(); i++) {
                    if (first.charAt(i) == ' ') {
                        wordsCountFirst++;
                    }
                }
            }
            firstStringSymbols = first.replaceAll("[^\\w+]", "");
        }
    }

    static class thread2 extends Thread {
        public void run() {
            if (second.length() != 0) {
                wordsCountSecond = 1;
                for (int i = 0; i < second.length(); i++) {
                    if (second.charAt(i) == ' ') {
                        wordsCountSecond++;
                    }
                }
            }
            secondStringSymbols = second.replaceAll("[^\\w+]", "");

        }
    }
}





