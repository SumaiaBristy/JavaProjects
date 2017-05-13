package oracle;

public class Movie {
@Override
    public void finalize() {
    
    System.out.println("Finalize called:...!");
    }
}
