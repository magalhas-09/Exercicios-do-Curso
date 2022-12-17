package entities;

public class currencyConverter {
	
	public double dollarPrice;
	public double price;
	
	
		
	public double percentageTotal() {
		return dollarPrice * price * 0.06;
	}
		
	public double valueConverter() {
		 return dollarPrice = dollarPrice * price + percentageTotal();
	}
	
	
	public String toString() {
		return "Amount to be paid in reais = " + String.format("%.2f", valueConverter());
	}

}
