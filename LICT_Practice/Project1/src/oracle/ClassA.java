package oracle;

public class ClassA {
   private int x;
   private int y;
   
   public class ClassB //here classB is again a property of class like x or y //example of polymorphism
   {
   
           public void getXY()
               {
                 System.out.println(x+" "+y);
               
               }
           public void setXY(int a,int b)
           {
           //eikhane this likhle outer class er instance variable k indicate krbe
               x=a;  //error dkhabe cz this will  not point to the inner class-ClassB object. solution hcche setXY er parameter chnge kre deya
               y=b;
             System.out.println(x+" "+y);
           
           }
   }
}
