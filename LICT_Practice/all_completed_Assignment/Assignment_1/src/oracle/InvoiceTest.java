package oracle;

public class InvoiceTest {
    public static void main(String[] args) {
        InvoiceTest invoiceTest = new InvoiceTest();
        Invoice i=new Invoice("101","leather",120,600.99D);
        System.out.println(i.getInvoiceAmount());
    }
}
