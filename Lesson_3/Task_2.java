package Lesson_3;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String txt = in.nextLine();
        switch (txt) {
            case "Hi" -> System.out.println("Hello");
            case "Bye" -> System.out.println("Good bye");
            case "How are you" -> System.out.println("How are you doing");
            case null, default -> System.out.println("Unknown message");
        }

        if ("Hi".equals(txt)) {
            System.out.println("Hello");
        } else if ("Bye".equals(txt)) {
            System.out.println("Good bye");
        } else if ("How are you".equals(txt)) {
            System.out.println("How are you doing");
        } else {
            System.out.println("Unknown message");
        }
    }
}
