package oracle;

public class ColorClass {
   
private static final char colorCode;
private String colorName;

static {
    colorCode='R';
}

public void displayCode() {
    
System.out.println("The Color Code Is: "+colorCode);
}

public  void displayColorName() {
    
    System.out.println("Color Name Is: "+colorName);
}
}
