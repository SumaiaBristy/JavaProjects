package oracle;

public class SuperMan extends Flyer {
    public SuperMan() {
        super();
    
    }
    
    public void A() {
        System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    @Override
    public String getDetails() {
        return "Within Superman.";
    }
    @Override
    public void takeOff() {
        System.out.println("Take Off of Superman Class");
    }
    @Override
    public void fly() {
        System.out.println("Fly of Superman Class");
    }
    @Override
    public void land() {
        System.out.println("land of Superman Class");
    }
}
