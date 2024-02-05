package lesson_7;

public class Task_4 {
    //Task 4 Распечатать только 7 чисел от 1 до 100, которые делятся на 5 без остатка. Используем цикл while
    public static void main(String[] args) {
        int i = 1;
        int coutNumber = 0;
        while (i <= 100 && coutNumber < 7) {


            System.out.println("tek schislo" + i);


            if (i % 5 == 0) {
                System.out.println(i);
                coutNumber++;
                i += 5;

            }   else  {
                i++;
            }


        }


    }


}
