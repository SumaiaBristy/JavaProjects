package assignment_4;

public class Sedan extends Car{
    private int length; 
    public Sedan() {
    }
    public Sedan(int s,double p,String c,int l) {
        super(s,p,c);
        this.length=l;
    }
    
    @Override
    public double getSalePrice(){
    if(length>20)
        return (super.getSalePrice()-(super.getSalePrice()*.5));
        else return (super.getSalePrice()-(super.getSalePrice()*.10));
    }
}
