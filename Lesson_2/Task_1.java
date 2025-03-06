package Lesson_2;

import java.util.Scanner;
/*
Введите с клавиатуры вещественные числа a и b. Выведите на экран результат выражения
c = ba(a + b)/(a2)
Совпадает ли результат выражения, если a и b — переменные типа int (для проверки не забудьте также использовать подходящий метод Scanner)?
*/
public class Task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        double c;
        double d;
        a = in.nextInt();
        b = in.nextInt();
        System.out.println(b * a * (a + b) / (a * a));
        c = in.nextDouble();
        d = in.nextDouble();
        System.out.println(d * c * (c + d) / (c * c));
    }

}
