package lesson_13;

public class Task_1 {

    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6};
        System.out.print("[");
        swap(intArray, 1, 5);
        for (int num : intArray) {
            System.out.print(num + ",");

        }
        System.out.println("]");


        String[] arrayString = {"kinder", "schule", "auto", "hause", "geld", "lehrner"};
        swap(arrayString, 1, 5);
        System.out.print("[");
        for (String str : arrayString) {
            System.out.print(str + ",");

        }
        System.out.println("]");
    }

//pproverka indexov

    public static void swap(int[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Error");
            return;

        }
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }

    public static void swap(String[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            return;


        }
        String temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;


    }


}

