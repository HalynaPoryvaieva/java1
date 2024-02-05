package lesson_03;

public class HomeWork03 {
    public static void main(String[] args) {

        System.out.println("Task_0");

        String name = "Halyna";
        byte age = 32;
        double milkPrice = 40.45d;
        System.out.println(name);
        System.out.println(age);
        System.out.println(milkPrice);

        System.out.println("Task_1");
        int a0 = 0;
        int a1 = 1;
        int a2 = 2;
        int a3 = 3;
        int a4 = 4;
        int a5 = 5;
        int a6 = 6;
        int a7 = 7;
        int a8 = 8;
        int a9 = 9;
        int result = (a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9) / 10;
        int result1 = (a0 + a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9) % 10;
        System.out.println("result :" + result);
        System.out.println("ostatok : " + result1);

        System.out.println("Task_2");
        double a = 1000;//€
        double b = 500;//€
        double sale = (a + b) / 100 * 10;
        double priceWithSale = (a + b) - sale;
        System.out.println("summa so skudkoj :" + priceWithSale);
        System.out.println("summa skydky : " + sale);

        System.out.println("Task_3");
        int mon = -1;
        int tue = 0;
        int wed = -2;
        int thu = -1;
        int fri = 0;
        int sat = 0;
        int sun = -1;
        double averageTemperature = (mon + thu + wed + tue + fri + sat + sun) / (double) 7;
        System.out.println("average Temperature for the week : " + averageTemperature);
        System.out.printf("average Temperature for the week %.3f :", averageTemperature);


        System.out.println("                         ");
        System.out.println("Task_4");
        int var1 = 3;
        int var2 = 2;
        int ostatok = 4 % var1;
        int ostatok1 = 5 % var2;
        System.out.println("ostatok ot delenyja na var1 :" + ostatok);
        System.out.println("ostatok ot delenyja na var2 : " + ostatok1);
        System.out.println();

        System.out.println("Task_5");
        int x = 3;
        x += x++;
        System.out.println(x);

        int c = 5;
        x = c + x + 1;
        System.out.println(x);





    }
}