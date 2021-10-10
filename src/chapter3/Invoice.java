/*
	3.12 (Invoice Class) Create a class called Invoice that a hardware store might use to represent
an invoice for an item sold at the store. An Invoice should include four pieces of information as
instance variables—a part number (type String), a part description (type String), a quantity of the
item being purchased (type int) and a price per item (double). Your class should have a constructor
that initializes the four instance variables. Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
 */

package chapter3;

public class Invoice{
	private String partNumber;
	private String partDescription;
	private int purchasedQuantity;
	private double itemPrice;

	public Invoice(String partNumber, String partDescription, int purchasedQuantity, double itemPrice){
		this.partNumber = partNumber;		
		this.partDescription = partDescription;
		this.purchasedQuantity = purchasedQuantity;
		this.itemPrice = itemPrice;
	}
	
	public void setPartNumber(String partNumber){
		this.partNumber = partNumber;
	}

	public String getPartNumber(){
		return partNumber;
	}

	public void setPartDescription(String partDescription){
		this.partDescription = partDescription;
	}

	public String getPartDescription(){
		return partDescription;
	}
	
	public void setPurchasedQuantity(int purchasedQuantity){
		this.purchasedQuantity = purchasedQuantity;
	}

	public int getPurchasedQuantity(){
		if (purchasedQuantity < 0){
			return 0;
		}
		else return purchasedQuantity;
	}

	public void setItemPrice(double itemPrice){
		this.itemPrice = itemPrice;
	}

	public double getItemPrice(){
		if (itemPrice < 0){
			return 0.0;
		}
		else return itemPrice;
	}

	public void setInvoiceAmount(double invoiceAmount){
	}

	public double getInvoiceAmount(){
		return itemPrice * purchasedQuantity;
	}
	
}