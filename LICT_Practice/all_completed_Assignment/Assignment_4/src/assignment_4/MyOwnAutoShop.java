package assignment_4;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        MyOwnAutoShop myOwnAutoShop = new MyOwnAutoShop();
        
        Sedan sedan1=new Sedan(120,12000,"blue",10);
        Ford ford1=new Ford(130,2000,"red",2000,500);
        Ford ford2=new Ford(150,4000,"yellow",2004,200);
        Car car1=new Car(170,5000,"black");
        System.out.println(sedan1.getSalePrice());
        System.out.println(ford1.getSalePrice());
        System.out.println(ford2.getSalePrice());
        System.out.println(car1.getSalePrice());
    }
}
