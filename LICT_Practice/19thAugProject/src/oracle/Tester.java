package oracle;

public class Tester {


@Override
public void finalize() {
    System.out.println("Finalize Called:...!");
}
    public static void main(String[] args) {
       //ColorClass c=new ColorClass();
       //c.displayCode();;
      // ColorClass.displayCode();
      //double d= Math.PI;
      //System.out.println(Math.sqrt(2));
      Tester t1=new Tester();
      System.out.println("Object 1 Created.");
        Tester t2=new Tester();
        System.out.println("Object 2 Created.");
        Tester t3=new Tester();
        System.out.println("Object 3 Created.");
        Tester t4=new Tester();
        System.out.println("Object 4 Created.");
        Tester t5=new Tester();
        System.out.println("Object 5 Created.");
        System.out.println("Trying To Cal gc.....!");
        System.gc();
        
    }
}
