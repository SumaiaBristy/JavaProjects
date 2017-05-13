package oracle;

public class Var {
private int result;

{
    result=0;    
}
public void add(int... n)
{
    
    for(int i : n) 
    {
        result=result+i;
    }
    System.out.println("Sum IS: "+result);
}

    public static void main(String[] args) {
        Var var = new Var();
        var.add(1,2,3,4,5,6,7,8,9,10,11,12,13,14);
    }
}
