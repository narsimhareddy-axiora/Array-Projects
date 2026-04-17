package Strings;

public class Payment {

	
	
	     void pay() {
	    	 System.out.println(" Processing payment ");
	    	 
	     }
	     class CashPayment extends Payment {
	    	 
	    	 @Override
	    	 void pay() {
	    		 
	    		 System.out.println("Payment done using Cash");
	    		 
	    	    		 
	    	 }
	     }
	     class Onlinepayment extends Payment {
	    	 @Override 
	     	     void pay() {
	    	 System.out.println("Payment done using Online Transfer");
	     }
	     }
	     public class Main {
	    	 
	     
	public static void main(String[] args) {
		
		Payment p;
		p = new CashPayment();
		p.pay();
		
		p = new Onlinepayment();
		p.pay();

	}

}
}
