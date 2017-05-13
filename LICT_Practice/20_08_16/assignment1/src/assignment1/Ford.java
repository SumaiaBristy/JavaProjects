package assignment1;

public class Ford extends Car{
   int Year;
   int manufacturerDiscount;
   {
   
   }
    public Ford(int Year,int manufacturerDiscount)
    {
       super();
       this.Year=Year;
       this.manufacturerDiscount=manufacturerDiscount;
    }
    @Override
    public void getSalePrice()
    {   
        System.out.println("====this is ford=====");
        System.out.println("weight:- "+Year);
        System.out.println("weight:- "+manufacturerDiscount);
    }
}
