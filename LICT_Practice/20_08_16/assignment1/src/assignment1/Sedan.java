package assignment1;

public class Sedan extends Car {
int Length;
{

}
        public Sedan(int Length)
        {
           super();
           this.Length=Length;
        }
    @Override
       public void getSalePrice()
        {
            System.out.println("====this is sedan =====");
            System.out.println("weight:- "+Length);
            
           
        }
}
