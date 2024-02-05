package lesson_13;

import java.util.Scanner;

public class Task_0 {
    //Task 0
    //
    //Написать метод переводящие все маленькие буквы латинского алфавита в строке в верхний регистр.
    //
    //toUpperCase() использовать низзя.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("vvedit malenkoju bukvu:");
        String imput = scanner.nextLine();
        char ch = imput.charAt(0);
        if (ch >= 'a' && ch <= 'z') { // Проверяем, является ли символ маленькой буквой латинского алфавита
            ch = (char) (ch - 32); // Преобразуем символ в верхний регистр
        }
        System.out.println("Результат: " + ch);


    }
}
