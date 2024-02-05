package lesson_6;

import java.util.Scanner;

public class Task_0 {
    public static void main(String[] args) {
        //
        //Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор:
        // 1, 2 или 3, а программа должна сказать, какое число ввёл пользова тель: 1, 2, или 3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvesti schislo 1 ili 2 ili 3: ");
        int schislo = scanner.nextInt();
        if (schislo == 1) {
            System.out.println(" Ваше число 1");

        } else if (schislo == 2) {
            System.out.println(" Ваше число 2");
        } else if (schislo == 3) {
            System.out.println(" Ваше число 3");
        } else {
            System.out.println("Vveli ne vernoe schilo");
        }


    }
}

