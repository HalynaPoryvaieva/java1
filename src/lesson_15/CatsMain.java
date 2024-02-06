package lesson_15;

public class CatsMain {
    public static void main(String[] args) {
        Cat cat =new Cat();

        cat.sayMeow();
        cat.run();
        cat.sleep();
        String catNameVar= cat.name;
        System.out.println("Cat Name"+catNameVar);
        System.out.println("vozrast cat"+cat.age);
        System.out.println("zvet"+cat.color);
        Cat cat1= new Cat( "Max");
        cat1.run();
        cat1.sleep();
        System.out.println("imja kota:"+cat1.name);
        System.out.println("vozrast:"+cat1.age);
        System.out.println("1 cat:"+cat.name);
        cat.whoAmi();
        cat1.whoAmi();
    }
}
