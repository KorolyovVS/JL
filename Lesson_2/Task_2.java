package Lesson_2;

import java.util.Scanner;
/*
Введите с клавиатуры целые числа a и b. Выведите на экран результат сравнения:
a3 > b2
*/
public class Task_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println((a * a * a) > (b * b));
    }
}
