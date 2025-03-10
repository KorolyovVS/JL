package Lesson_3;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        double d;
        if ((n1 % 2 == 0) ^ (n2 % 3 == 0)) {
            System.out.println(n1 == n2);
        }
        if ((n1 % 2 == 0) & (n1 % 3 == 0)) {
            d = Math.pow(n1,n2);
            if (d > Integer.MAX_VALUE) {
                System.out.println("Результат слишком большой!");
            } else {
                System.out.println(d);
            }
        }
    }
}
