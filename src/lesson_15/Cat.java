package lesson_15;

public class Cat {
    String name;
    String color;
    int age;
    public Cat(){
        System.out.println("k1");

    }
    public Cat(String catName){
        name=catName;
        System.out.println("k2");
    }
    public void whoAmi(){
        System.out.println ("kto ja:"+ name+",moj age:"+age+color);
    }

    void sleep() {
        System.out.println("splju");

    }

    void sayMeow() {
        System.out.println("meow");

    }

    void run() {
        System.out.println("Run");
    }

}
