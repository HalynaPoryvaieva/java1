package lesson_12;

import java.util.Random;

public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] xx = new int[random.nextInt(100000)];
        System.out.println(array(xx));
        array(xx);

    }

    public static int array(int[] xx) {

        int result = 0;
        for (int i = 0; i < xx.length; i++) {
            if (myArray(xx[i])) {
                result++;

            }
        }
        return result;

    }

    public static boolean myArray(int x) {

        boolean result = true;

        for (int i = 2; i < 8; i++) {


            if (x % 2 == 0) {
                result = false;

                break;


            }


        }
        return result;


    }
}