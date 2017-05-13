package oracle;

public class Airbus extends Flyer {
    public Airbus() {
    super();
    }
    public void C() {
        System.out.println("ccccccccccccccccccccccccc");
    }
    @Override
    public String getDetails() {
        return "Within Airbus.";
    }
    @Override
    public void takeOff() {
        System.out.println("Take Off of Airbus Class");
    }
    @Override
    public void fly() {
        System.out.println("Fly of Airbus Class");
    }
    @Override
    public void land() {
        System.out.println("land of Airbus Class");
    }
    
}
