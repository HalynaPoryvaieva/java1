package lesson_12;

public class Task_0 {


    //Перегрузить метод, если в него приходит индекс, то часть массива слева до этого индекса распечатывается в обычном порядке,
    // а начиная с этого индекса в обратном:
    //
    //{1, 4, 3, 6, 7} + индекс 2 - > распечатывает [1, 4, 7, 6, 3]
    //Еще одна перегрузка: метод принимает массив и булевый флаг. Если флаг == true -> печатает массив в обратном порядке
    // Если флаг == false -> печатает массив в прямом порядке
    //


    public static void main(String[] args) {

        int[] array = {1, 4, 3, 6, 7};
        printReverseArray(array, 2);
        printReverseArray(array, false);
        printReverseArray(array, true);

    }

    public static void printReverseArray(int[] ints, int index) {
        System.out.print("[");
        for (int i = 0; i <= index; i++) {
            //for (int i = 0; i < array.length; i++) {
            System.out.print(ints[i] + ",");


        }
        for (int i = ints.length - 1; i > index; i--) {
            System.out.print(ints[i] + ((i > 3) ? "," : "]\n"));


        }


    }

    public static void printReverseArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));


        }
    }

    public static void reverseArray(int[] array) {
        System.out.print("[");
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ((i > 0) ? ", " : "]\n"));

        }


    }

    public static void printReverseArray(int[] ints, boolean flag) {
        if (flag == true) {
            printReverseArray(ints);


        }
        if (flag == false) {
            reverseArray(ints);
        }


    }

}








