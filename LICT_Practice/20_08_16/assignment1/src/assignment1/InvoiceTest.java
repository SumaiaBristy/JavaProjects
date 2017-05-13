package assignment1;

public class InvoiceTest {
    public static void main(String[] args) {
    
    Invoice i=null;
    i=new Invoice("111","drinks",3,30.00);
        i.getInvoiceAmount();
        i=new Invoice("222","chocolate",10,23.00);
       i.getInvoiceAmount();
    }
}
