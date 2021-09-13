package ChapterThree;

public class TryOutInvoice {
    private String partNumber;
    private String partDescription;
    private int itemQuantity;
    private double itemPrice;

    public TryOutInvoice (String partNumber, String partDescription, int itemQuantity, double itemPrice) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.itemQuantity = itemQuantity;
        this.itemPrice = itemPrice;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setItemQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getItemQuantity() {
        if(itemQuantity < 0 )
            return itemQuantity = 0;
        else
            return itemQuantity;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public double getItemPrice() {
        if(itemPrice < 0 )
            return itemPrice = 0.0;
        else
            return itemPrice;
    }

    public double getInvoiceAmount() {

        return itemQuantity * itemPrice;
    }

}
