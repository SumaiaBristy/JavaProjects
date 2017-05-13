package oracle;

public class Var {
private int result;
//simple brace can be used to identify default constructor
{
    result=0;

}
    public void add(int...n) //here parameter is undefined!!
    {
       for(int i:n)
       {
       result=result+i;
       
       }
       System.out.println("sum is: "+result);
    }
    public static void main(String[] args)
       {
         Var var=new Var();
         var.add(1,2,3,4);
         
    
      }
    
}
