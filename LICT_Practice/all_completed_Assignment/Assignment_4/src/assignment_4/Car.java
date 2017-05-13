package assignment_4;

public class Car {

    public int speed;
    public double reglarPrice;
    public String gColor;
    
    public Car() {
    }
    public Car(int s,double p,String c) {
        this.speed=s;
        this.reglarPrice=p;
        this.gColor=c;
    }
    public double getSalePrice(){
        return this.reglarPrice;
    }
}
