package Lesson_1;

/*
На месте комментария написать код, который присвоит переменной a значение переменной b и наоборот.
Подсказка: можно использовать третью переменную.
Вариант на подумать: реализовать задачу, НЕ используя третью переменную.

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        // место для вашего кода

        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
*/

public class Task_1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c;

        c = a;
        a = b;
        b = c;

        System.out.println("Значение а: " + a + ". Значение b: " + b);

        a = 5;
        b = 10;

        b = b - a;
        a = b + a;

        System.out.println("Значение а: " + a + ". Значение b: " + b);
    }
}
