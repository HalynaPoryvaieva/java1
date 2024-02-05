package lesson_12;

public class Task_1 {
    public static void main(String[] args) {
        int x = 2;

        System.out.println(myArray(x));


    }

    public static boolean myArray(int x) {

        boolean result = true;

        for (int i = 2; i < Math.sqrt(x); i++) {


            if (x % 2 == 0) {
                result = false;

                break;


            }


        }
        return result;

    }
}