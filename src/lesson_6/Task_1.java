package lesson_6;

import java.util.Random;

public class Task_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand1 = random.nextInt(101);
        int rand2 = random.nextInt(101);
        int rand3 = random.nextInt(101);
        int rand4 = random.nextInt(101);
        System.out.println("rand1: " + rand1);
        System.out.println("rand2: " + rand2);
        System.out.println("rand3: " + rand3);
        System.out.println("rand4: " + rand4);


        if (rand1 > rand2 && rand1> rand3 && rand1> rand4) {
            System.out.println("maxResult:" + rand1);

        } else if (rand2 > rand1 &&rand2> rand3 &&rand2> rand4) {
            System.out.println("maxResult:" + rand2);
        } else if (rand3 > rand1 &&rand3> rand2 &&rand3> rand4) {
            System.out.println("maxResult:" + rand3);
        } else if (rand4 > rand1 &&rand4> rand2 &&rand4> rand3) {
            System.out.println("maxResult:" + rand4);
        }
    }
}
