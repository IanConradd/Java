public class PTASK17 {

	public static void main(String[] args) {
		double stockpur= 1000;
		double stockpaid = 45.50;
		double firstcom;
		double totalpur;
		double soldstoshare= 56.90;
		double secondcom;
		double totsold;
		double profit;
		
		System.out.println("---------------RIZAL TECHNOLOGICAL UNIVERSITY-----------------");
	    System.out.println("---------------------STOCK TRANSACTION PROGRAM-----------------\n");
		
		totalpur = stockpur * stockpaid;
		firstcom = totalpur * 0.02;
		
		totsold = stockpur * soldstoshare;
		secondcom = totsold *0.02;
		
		profit = totsold- (totalpur +firstcom+secondcom);
		
		System.out.print("Amount of Money That Joe Paid for The Stock:  Php "+totalpur);
		System.out.println("");
		System.out.print("Amount of Commmision that Joe Paid When Bought the Stock: Php "+firstcom);
		System.out.println("");
		System.out.print("Amount of When Joe Sold the Stock:  Php "+totsold);
		System.out.println("");
		System.out.print("Amount of Commmision that Joe Paid When Sold the Stock:  Php "+secondcom);
		System.out.println("");
		System.out.print("\n   Total Profit of Joe is: Php "+profit);
		
		
		
		
			System.out.println("\n     -Joe Gain Money on the Transaction");

		    System.out.println("\n---------------------THANKYOU FOR USING----------------------");
		
		
		
		

	}

}
