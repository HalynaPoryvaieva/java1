package lesson_15.hm14;

public class Kitchen {
    String name;
    String colour;
    int price;
    public Kitchen(){
        System.out.println();

    }

    public Kitchen(String kitchenName){
        System.out.println(kitchenName);
    }
    public void eboutKitchen(){
        System.out.println("kakaja mebel:"+name+" "+colour+" "+price);
    }
    void save(){
        System.out.println("sochranenie posudy:");

    }
    void cookPlace(){
        System.out.println("gotovka blud");
    }




}
