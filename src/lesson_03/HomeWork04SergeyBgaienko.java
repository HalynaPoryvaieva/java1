package lesson_03;

import java.util.Random;

public class HomeWork04SergeyBgaienko {
    /*
@date 19.01.2024
@author Sergey Bugaienko
*/

    /*
    В классе HomeWork03.java задекларировать (объявить) и присвоить значения 3-м переменным.
    Правильно подберите имя переменным и выберите тип.
    Переменная 1 - Ваше имя
    Переменная 2 - сколько Вам полных лет
    Переменная 3 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
     */

        public static void main(String[] args) {
            String name = "Name";
            int age = 100;
            double milkPrice = 1.40;
            System.out.println(           );

            /*
@date 19.01.2024
@author Sergey Bugaienko
*/

/*
 Объявите 10 переменных типа int со значениями 0, 1, 2, 3, 4, 5, 6, 7, 8, 9.
 Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 10.
 Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
 Распечатайте её через println. Сколько программа отбросила в дробной части?
 */

                    int var0 = 0;
                    int var1 = 1;
                    int var3 = 3;
                    int var2 = 2;
                    int var4 = 4;
                    int var6 = 6;
                    int var5 = 5;
                    int var7 = 7;
                    int var8 = 8;
                    int var9 = 9;

                    int countVariables = 10;
//        int result = (var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9) / 10;
                    int sum = var0 + var1 + var2 + var3 + var4 + var5 + var6 + var7 + var8 + var9;

                    System.out.println("sum: " + sum);

                    int average = sum / countVariables;
                    System.out.println("average: " + average );

                    //есть два пути
                    double averageDouble = (double) sum / countVariables;
                    System.out.println("averageDouble: " + averageDouble);

                    int rest = (int) ((averageDouble - average) * countVariables);
                    System.out.println("rest: " + rest);

                    rest = sum % countVariables;
                    System.out.println("rest: " + rest);
            System.out.println(                                   );



            /*
@date 19.01.2024
@author Sergey Bugaienko
*/

/*
Пусть цена товара A обычно составляет 1000 Euro, и товара B составляет 500 Euro.
Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.
Выведите на экран переменную, которая соответствует стоимости суммы A+B со скидкой.
Отдельно выведите на экран сумму скидки от этой покупки (в деньгах).
 */

                    double priceA = 1000;
                    double priceB = 500;
                    int discount = 10;

                    //скидка в деньгах
                    double discountMoney = (priceA + priceB) * discount / 100;
                    System.out.println("discountMoney: " + discountMoney);

                    //два варианта
                    double priceWithDiscount = (priceA + priceB) - discountMoney;
                    System.out.println("priceWithDiscount: " + priceWithDiscount);

                    priceWithDiscount = (priceA + priceB) * (100 - discount) / 100;
                    System.out.println("Цена товаров со скидкой: " + priceWithDiscount + " Евро");
            System.out.println(                         );



            /*
@date 19.01.2024
@author Sergey Bugaienko
*/

/*
Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю.
Вычислите среднюю температуру за неделю и выведете ее на печать.
 */

                    int t1 = 8;
                    int t2 = 5;
                    int t3 = 5;
                    int t4 = 5;
                    int t5 = 5;
                    int t6 = 5;
                    int t7 = 5;

                    double averageTemp = ((double) t1 + t2 + t3 + t4 + t5 + t6 + t7) / 7;

                    System.out.println("averageTemp: " + averageTemp);
            System.out.println(                             );


            /*
@date 19.01.2024
@author Sergey Bugaienko
*/



/*
Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?
Покажите это на конкретных примерах.
 */

                    // x % 5 -> () целая часть может быть любой. [0... inf); дробная часть
                    // (0, 1, 2, 3, 4) -> [0, x-1]

                    // 2 -> 0, 1 - в остатке
                    // 3 -> 0, 1, 2 - в остатке

                    Random random = new Random(); // инструмент для генерации псевдослучайных чисел
                    int rand = random.nextInt(10); // получаем случайное число в диапазоне от 0 до 9 включительно
                    System.out.println("rand: " + rand);
                    System.out.println(rand % 3);

                    // Четные числа -> число, которое делится на 2 без остатка (кратное 2)
                    int x;
//        x % 2 -> остаток 0? - четное, остаток равен 1 (не равен 0) -> не четное







                }

    }
