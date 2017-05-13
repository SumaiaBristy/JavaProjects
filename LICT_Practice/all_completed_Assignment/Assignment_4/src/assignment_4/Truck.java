package assignment_4;

public class Truck extends Car{
    
    private int weight;
    public Truck() {
    }
    @Override
    public double getSalePrice(){
        if(this.weight>2000)
        
        {
            this.reglarPrice=this.reglarPrice-this.reglarPrice*.10;
        }
        else
            this.reglarPrice=this.reglarPrice-this.reglarPrice*.20;
        return this.reglarPrice;
        
        
    }
    
}
