package oracle;

public class TestInner {

  public static void main(String args[])
              {
                 ClassA a=new ClassA();
                 a.new ClassB().getXY();
                  a.new ClassB().setXY(10,20);
                  a.new ClassB().getXY();
                 //ClassA.ClassB obj1=new ClassA().ClassB; //inner class static na hole o object create kora charai access kora jay
              
              }
}
