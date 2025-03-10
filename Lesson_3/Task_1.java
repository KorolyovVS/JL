package Lesson_3;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        if ((n1 % 2) == 0) {
            System.out.println(n1 * n2);
        } else {
            System.out.println((double) n1 / n2);
        }
        if (n1 == n2) {
            System.out.println("Числа равны!");
        }
    }
}
