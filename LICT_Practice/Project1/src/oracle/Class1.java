package oracle;

 public class Class1 {
    private static final char colorCode; //static block diye initialize krte hbe tailei use krte prbo naile error dkhabe
    private String colorName;
    static
    {
    colorCode='R';
    
    }
    public static void displayCode()
    {
    
      System.out.println("The Color code is:- "+colorCode); //ekta nonstatic method
    }
    
    public  void displayColorName()

            {
               
                System.out.println("The Color code is:- "+colorName); //ekta static method only ekta static variable k i access korte pre
            }


}
