package oracle;

public class SuperMan extends Flyer {


    public SuperMan() {
    super();
    }
    public void A()
    {
    System.out.println("AAAAAAAAAAAA");
    
    }
    @Override
    public String getDetails(){
        
        return "within superman!";
        
        }
    @Override
    public void takeOff()
    {
      System.out.println("takeOff of superman class");
    
    }
    @Override
        public void fly()
        {
          System.out.println("fly of superman class");
        
        }
    @Override
    public void land()
    {
      System.out.println("land of superman class");
    
    }

   
}

