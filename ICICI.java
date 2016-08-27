public class ICICI extends Bank {
	
	int roi;
	
	ICICI(){
		
		roi = 7;
		
	}
	
	public void getRateOfInterest(){
		
		System.out.println("Rate of Interest = " + roi + "%.");
		
	}

	public static void main(String[] args) {
		
		ICICI icici = new ICICI();
		icici.getRateOfInterest();

	}

}
