package oracle;
// example of instanceof to determine object type during run time
public class Tester2 {

    public void findFlyer(Object f) //Flyer f er poriborte Object f likha jay cz eta by default sob class k refer krte pare!!
    {
        if(f instanceof SuperMan)
        {
        SuperMan s=(SuperMan)f; //instanceof use krle ofcrs type catsing needed
        
        System.out.println("I am superman..");
        s.A();
        
        }
        else if(f instanceof Bird)
        {
          Bird s=(Bird)f; //instanceof use krle ofcrs type catsing needed
        
        System.out.println("I am Brid..");
        s.B();
        
        }
        else
        {
            System.out.println("unknown...");
        
        }
    }
    public static void main(String args[]) {
    
    Flyer flyer=new Flyer();
    flyer=new SuperMan();
    Tester2 two= new Tester2();
    flyer.takeOff();
        two.findFlyer(flyer);
    flyer=new Bird();
        
    flyer.takeOff();
        two.findFlyer(flyer);
        Flyer f =new Flyer();
        two.findFlyer(f);
   
    }
}