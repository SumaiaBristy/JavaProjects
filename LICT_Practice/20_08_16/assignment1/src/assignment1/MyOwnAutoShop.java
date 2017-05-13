package assignment1;

public class MyOwnAutoShop {
    public static void main(String[] args) {
    
    
     Car c=new Sedan(34);
       c.getSalePrice();
       c=new Truck(65);
       c.getSalePrice();
       c=new Ford(2016,45);
       c.getSalePrice();
       c=new Ford(2015,34);
       c.getSalePrice();
       Car c1=new Car(34,13567,"RED");
       c1.getSalePrice();
       
    
     
    }
}
