package lesson_7;

import java.util.Random;
import java.util.Scanner;

//Task 0
//
//Перепишите решение задачи с использованием switch вместо if-else:
//
//Необходимо написать программу, где бы пользователю предлагалось ввести число на выбор: 1, 2 или 3,
// а программа должна сказать, какое число ввёл пользователь: 1, 2, или 3
public class Task_0 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bвести число на выбор: 1, 2 или 3:");
        int rand = scanner.nextInt();
        Random random = new Random();
        int rand2 = random.nextInt(4);

        rand2 = rand;

        switch (rand) {
            case 1:

                break;
            case 2:
                break;
            case 3:
                break;

            default:

                System.out.println("Ne vernoe schislo");


        }
        System.out.println("schislo:" + rand2);

    }


}
