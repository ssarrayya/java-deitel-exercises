package chapter3;

public class TryOutInvoiceTest {
    public static void main(String[] args) {
        TryOutInvoice sarahInvoice = new TryOutInvoice("1001A", "Crankshaft", 5, 50.05);

        System.out.println("The part number is " + sarahInvoice.getPartNumber());
        System.out.println("Part description : " + sarahInvoice.getPartDescription());
        System.out.println("Quantity of the item ordered is " + sarahInvoice.getItemQuantity());
        System.out.println("Price of item ordered is " + sarahInvoice.getItemPrice());
        System.out.println("The invoice amount is " + sarahInvoice.getInvoiceAmount());
    }
}
