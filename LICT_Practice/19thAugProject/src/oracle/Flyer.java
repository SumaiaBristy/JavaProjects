package oracle;

public class Flyer {
    private int no_of_wings;
    
    public Flyer() {
        
    }
    
    public Flyer(int no_of_wings)
    {
        this.no_of_wings=no_of_wings;
    }
    
    public int getNoOfWings() {
        return no_of_wings;
    }
    
    public void setNoOfWings(int no_of_wings) {
        this.no_of_wings=no_of_wings;
    }
    public void takeOff() {
        System.out.println("Take Off of Flyer Class");
    }
    public void fly() {
        System.out.println("Fly of Flyer Class");
    }
    
    public void land() {
        System.out.println("land of Flyer Class");
    }
    public String getDetails() {
        return "Within Flyer Class";
    }
}
