package lesson_7;

import java.util.Random;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Task 1 (Использовать оператор switch)

        // Программа просит пользователя ввести число от 1 до 7 Если число равно 1,
        // выводим на консоль “Понедельник”, 2 –”Вторник” и так далее. Если 6 или 7 – “Выходной”.


        Scanner scanner = new Scanner(System.in);
        System.out.println("Bвести число на выбор: 1-7:");
        int var = scanner.nextInt();


        String x = "Montag";
        String y = "Dinstag";
        String z = "Mitwoche";
        String f = "Donerstag";
        String d = "Freitag";
        String s = "Wochenende";


        switch (var) {
            case 1:
                System.out.println(x);


                break;
            case 2:
                System.out.println(y);


                break;
            case 3:
                System.out.println(z);
                break;

            case 4:
                System.out.println(f);
                break;
            case 5:
                System.out.println(d);
                break;
            case 6:
                System.out.println(s);
                break;
            case 7:
                System.out.println(s);
                break;

            default:

                System.out.println("net takogo dnja");


        }
        System.out.println("Tag:" + var);

    }
}


