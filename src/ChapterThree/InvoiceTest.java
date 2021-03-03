package ChapterThree;

public class InvoiceTest{
	public static void main(String[] args){

		Invoice sparInvoice = new Invoice("2S1A0R5A2H000", "Facial cleansing oil", 4, 5.99);

		System.out.println("The part number is " + sparInvoice.getPartNumber());

		System.out.println("Part description: " + sparInvoice.getPartDescription());

		System.out.println("The quantity of the purchased item is " + sparInvoice.getPurchasedQuantity());

		System.out.println("The price of the purchased item is " + sparInvoice.getItemPrice());

		System.out.println("Invoice amount is " + sparInvoice.getInvoiceAmount());
	}

}