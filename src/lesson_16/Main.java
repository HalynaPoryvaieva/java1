package lesson_16;

public class Main {
    public static void main(String[] args) {
        RubberArray ra = new RubberArray();
        System.out.println(ra.toString());
        ra.add(15);
        ra.add(-10);
        ra.add(100);
        for (int i = 0; i < 10; i++) {
            ra.add(i);
            System.out.println(ra.toString());
        }
        ra.add(100,15,17,-5,24);
        System.out.println(ra.toString());

        System.out.println( ra.indexArrey(ra.array, 15));


    }
}
