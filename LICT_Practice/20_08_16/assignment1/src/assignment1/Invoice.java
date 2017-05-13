package assignment1;

public class Invoice {

    private String partNumber;
    private String partDescription;
    private int quantity;
    private double price;

{


}

    public Invoice(String partNumber,String partDescription,int quantity,double price) {
         
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.price=price;
        
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        if(quantity<0)
            quantity=0;
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        if(price<0.0)
          price=0.0;
        return price;
    }

    public void setPrice(double price) {
    
        this.price = price;
    }
    
    
            public double getInvoiceAmount()
                    {
                        
                       
                        
                        double total=(double)price*quantity;
                        System.out.println("total amount: "+total);
                        
                        return total;
                    }
                    
}
