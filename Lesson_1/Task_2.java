package Lesson_1;
/*
Используя

Переменную типа String;
Несколько переменных типа char;
Одну переменную типа char.
вывести свое имя в консоль.

Вывод в консоль с переходом на новую строку:

        System.out.println(ваша переменная)
Вывод в консоль без перехода на новую строку:

        System.out.print(ваша переменная)
Усложнение для внимательных: вывести ваше имя посимвольно, где каждая буква — на новой строке,
не используя System.out.println(). Реализуется как с использованием String, так и используя char.
*/
public class Task_2 {
    public static void main(String[] args) {
        String name1= "KVS";
        String name2 = """
                K
                V
                S""";
        char n1 = 'K';
        char n2 = 'V';
        char n3 = 'S';
        char n0;
        System.out.println(name1);
        System.out.print(name2 + "\n");
        System.out.print(n1);
        System.out.print(n2);
        System.out.println(n3);
        n0 = 'K';
        System.out.print(n0);
        n0 = 'V';
        System.out.print(n0);
        n0 = 'S';
        System.out.print(n0);
    }
}
