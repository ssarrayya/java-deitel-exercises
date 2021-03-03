package ChapterThree;

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