package oracle;

public class Bird extends Flyer {
    public Bird() {
    }
    public void B() {
        System.out.println("BBBBBBBBBBBBBBBBBBBBBBBB");
    }
    @Override
    public String getDetails() {
        return "Within Bird";
    }
    @Override
    public void takeOff() {
        System.out.println("Take Off of Bird Class");
    }
    @Override
    public void fly() {
        System.out.println("Fly of Bird Class");
    }
    @Override
    public void land() {
        System.out.println("land of Bird Class");
    }
}
