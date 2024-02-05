package lesson_7;

import java.util.Random;

//Task 2 Реализовать с использованием switch Ваш ребенок принес оценку за контрольную работу по математике.
// В школе 12 бальная система. Запишите в переменную случайное число от 0 до 12.
// Вы разрешаете ребенку смотреть телевизор не более 60 минут в день.
// (Оставшееся время не может быть больше 1 часа) На сегодня у него осталось 45 минут. (записать в переменную)
//
//Если оценка от 10 до 12 баллов -> Скажите ему, как вы рады и добавьте к оставшемуся
// на сегодня времени 1 час от 7 до 9 ->
// Слова похвалы на экран + ко времени 45 минут от 4 до 6 -> Нейтральные слова + ко времени 15 минут 3 ->
// Огорчитесь.
// Минус 30 минут ко времени оценка меньше -> Трагедия. Сегодня ТВ смотреть запрещено
//
//Выведите на экран оставшееся на сегодня время для просмотра ТВ
//
//P.S. Реализовать с использованием switch
//
//Циклы
public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int rand = random.nextInt(13);
        System.out.println(rand);

        int uhr1 = 45;
        uhr1 = rand;
        switch (uhr1) {
            case 12:
            case 11:
            case 10:
                uhr1 += 60;
                System.out.println("molodez");
                System.out.println("vremja orosmotra televyzora s 7.00-9.00");
                //System.out.println("vremja +:" + 60);
                break;
            case 9:
            case 8:
            case 7:

                uhr1 += 45;
                System.out.println("molodez");
                System.out.println("vremja orosmotra televyzora s 4.00-6.00");
               // System.out.println("vremja +:" + 45);
                break;
            case 6:
            case 5:
            case 4:
                uhr1 += 15;
                System.out.println("uschis bolche");
             //   System.out.println("vremja +:" + 15);
                break;
            case 3:
            case 2:
            case 1:
                uhr1 -= 30;
                System.out.println("smotret  televizor zapret");
            default:
                System.out.println("smotret  televizor zapret");



        } if (uhr1>60){
            uhr1=60;
        }else  if (uhr1<0){
            uhr1=0;
        }
        System.out.println("vremja +:" +uhr1);


    }
}
