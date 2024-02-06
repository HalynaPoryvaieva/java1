package lesson_14;

public class Task_2 {
    public static void main(String[] args) {
        //Task 2
        //
        //Написать метод, принимающий строку и один или два индекса (перегрузка). Метод должен возвращать подстроку
        // начиная с первого индекса (включительно) и заканчивая вторым индексом (не включительно) Если индекс 1 - начиная
        // с индекса и до конца строки.
        //
        //Функционал повторяет метод String.substring(), так что этот метод использовать не нужно. Оригинальный метод
        // ломает программу, если введены не корректные индексы. Наш метод аварийно завершать программу не должен.


        stringSubstring("Hallo World", 2);
        System.out.println(stringSubstring("Hallo World", 2));
        stringSubstring("Hallo World", 2, 3);
        System.out.println(stringSubstring("Hallo World", 2, 3));


    }

    public static String stringSubstring(String str, int startIndex) {

        if (startIndex < 0 || startIndex >= str.length()) {
            return "";


        }
        return str.substring(startIndex);

    }

    public static String stringSubstring(String str, int startIndex, int endIndex) {

        if (startIndex < 0 || startIndex >= str.length() || endIndex < 0 || endIndex >= str.length() || endIndex <= startIndex) {
            return "";


        }
        return str.substring(startIndex, endIndex);

    }

}
