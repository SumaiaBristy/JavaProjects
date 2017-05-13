package oracle;
//polymorphism example
public class Flyer {
    
    private int no_of_wings;
    
    public Flyer()
    {
       
    
    }
    public Flyer(int no_of_wings)
    
        {
        this.no_of_wings=no_of_wings;
        
        }
    public int getNoOfWings()
        {
           return no_of_wings;
        }
    public void setNoOfWings(int no_of_wings)
        {
            this.no_of_wings=no_of_wings;
        
        }
    public void takeOff()
    {
      System.out.println("takeOff of Flyer class");
    
    }
        public void fly()
        {
          System.out.println("fly of Flyer class");
        
        }
    public void land()
    {
      System.out.println("land of Flyer class");
    
    }
        public String getDetails()
        {
           return "Within Flyer Class";
        }
}
