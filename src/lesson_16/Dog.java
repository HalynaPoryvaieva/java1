package lesson_16;

public class Dog {
    String name;
    int weigth;
    public Dog(String name,int weigth){
        this.name=name;
        this.weigth=weigth;

    }
    void est(){
        System.out.println("ja em");
        weigth++;
    }
    void run(){
        while (weigth < 3) {
            System.out.println("soory! choschu est");
            System.out.println("moj ves "+weigth+"nado poest");
            est();
        }
        System.out.println("begu");
        weigth-=2;
    }
    String whoAm(){
        return "I am dog"+ this.name+ "my weith"+weigth;
    }

}
