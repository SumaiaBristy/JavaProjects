package oracle;

public class Tester2 {

public void findFlyer(Object f)
{
    if(f instanceof SuperMan) {
        SuperMan s=(SuperMan)f;
        System.out.println("I Am Superman..");
        s.A();
    }
    else if(f instanceof Bird) {
        Bird b=(Bird)f;
        System.out.println("I Am Bird..");
        b.B();
    }
    else if(f instanceof Airbus) {
        Airbus c=(Airbus)f;
        System.out.println("I Am Air Bus..");
        c.C();
    }
    else {
        System.out.println("Unknown..");
    }
    

    
}
    public static void main(String[] args) {
        
        Tester2 two=new Tester2();
        Flyer flyer=null;
        flyer=new SuperMan();
    
        
        flyer.takeOff();
        two.findFlyer(flyer);
        flyer=new Bird();
        flyer.takeOff();
        two.findFlyer(flyer);
        flyer=new Airbus();
        flyer.takeOff();
        two.findFlyer(flyer);
        flyer=new Flyer();
        two.findFlyer(flyer);
      
        
    }
}
