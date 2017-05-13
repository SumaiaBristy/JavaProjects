package assignment1;

public class Truck extends Car {
int Weight;
{

}
    public Truck(int Weight)
    {
       super();
       this.Weight=Weight;
    }
    @Override
        public void getSalePrice()
        {
            System.out.println("====this is truck=====");
           System.out.println("weight:- "+Weight);
        }
}
