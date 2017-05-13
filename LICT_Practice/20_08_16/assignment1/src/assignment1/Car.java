package assignment1;

public class Car {
  int Speed;
  double regularPrice;
  String gColor;
   public Car() {
    
    
    }
    public Car(int Speed,double regularPrice,String gColor ) {
    this.Speed=Speed;
    this.regularPrice=regularPrice;
    this.gColor=gColor;
    
    }
    
    public void getSalePrice()
     {
         System.out.println("====this is car=====");
         System.out.println("weight:- "+Speed);
         System.out.println("weight:- "+regularPrice);
         System.out.println("weight:- "+gColor);
     }
    
    
}
