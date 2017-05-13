package assignment_4;

public class Ford extends Car{

    private int year;
    private int manufacturerDiscount;
    public Ford() {
    }
    public Ford(int s,double p,String c,int y,int m) {
        super(s,p,c);
        this.year=y;
        this.manufacturerDiscount=m;
    }
    @Override
    public double getSalePrice(){
        return super.getSalePrice()-manufacturerDiscount;
    }
}
