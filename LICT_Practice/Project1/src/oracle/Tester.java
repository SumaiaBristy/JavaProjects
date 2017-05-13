package oracle;

 public class Tester {
    public static void main(String args[]) {
    
      // ColorClass c=new ColorClass();
      //c.displayCode();
   //   Class1.displayCode(); //object er dorkar nai,static method k object create kora charai directly call kora jay
     // double d=Math.PI;
     // System.out.println(""+d);
     Tester t1=new Tester();
     System.out.println("Object 1 created.");
     
        Tester t2=new Tester();
        System.out.println("Object 2 created.");
        Tester t3=new Tester();
        System.out.println("Object 3 created.");
        Tester t4=new Tester();
        System.out.println("Object 4 created.");
        System.out.println("Trying to call gc() method...!"); // gc() call hbe na cz garbage collector essential mone kore nai.
        System.gc();
    }
}
