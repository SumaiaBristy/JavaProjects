package oracle;

public class Bird extends Flyer{

    public Bird(){
    super();
    }
    public void B()
    {
    System.out.println("BBBBBBB");
    
    }
    @Override
    public String getDetails()
    {
    return "within bird!";
    }
    @Override //overrride likha mandatory na,na likhleo ovveride krbe!!
    public void takeOff()
    {
      System.out.println("takeOff of bird class");
    
    }
    @Override
        public void fly()
        {
          System.out.println("fly of bird class");
        
        }
    @Override
    public void land()
    {
      System.out.println("land of bird class");
    
    }
}
