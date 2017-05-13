package oracle;

public class Invoice {

    private  String number;
    private String description;
    private int quantity;
    private double priceLPerUnit;
    public Invoice() {
    }
    public Invoice(String aNummber,String adescription,int aquantity,double apriceLPerUnit) {this.setNumber(aNummber);
        this.setDescription(adescription);
        this.setQuantity(aquantity);
        this.setPriceLPerUnit(apriceLPerUnit);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPriceLPerUnit() {
        return priceLPerUnit;
    }

    public void setPriceLPerUnit(double priceLPerUnit) {
        this.priceLPerUnit = priceLPerUnit;
    }
    public double getInvoiceAmount(){
        double amount=quantity*priceLPerUnit;
        if(amount>0)return amount;
        else return 0;
    }
}
