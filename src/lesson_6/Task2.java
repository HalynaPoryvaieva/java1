package lesson_6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Task 2 *Повышенной сложности (опционально)
        //
        //программа предлагает пользователю ввести четырехзначное число
        //Причем: мы можем получать от пользователя ТОЛЬКО строки. Данные в формате String
        //Если число не четырехзначное, должно вывестись на экран сообщение об ошибке и работа программы завершается
        //Проверить, является ли число "счастливым билетом". Т.е. совпадает ли сумма цифр первых двух цифр числа с
        // суммой третьей и четвертой цифры
        // Пример:

        //  число 1450 -> (1+4) = 5; (5+0) = 5; 5 равно 5 - число счастливое
        //число 1654 -> (1+6) = 7; (5+4) = 9; 7 не равно 9 - число НЕ является счастливым
        Scanner scanner = new Scanner(System.in);
        System.out.println("ввести четырехзначное число:");
        String name = scanner.nextLine();
        if (name.length() != 4) {


            System.out.println("число не четырехзначное");
        }

        int summa = name.charAt(0) + name.charAt(1);
        int summa1 = name.charAt(2) + name.charAt(3);

        if (summa == summa1) {

            System.out.println("число счастливое");
        }
        if (summa1 != summa) {
            System.out.println("число НЕ является счастливым");
        }


    }


}

