public class SBI extends Bank {
	
	int roi;
	
	SBI(){
		
		roi = 8;
		
	}
	
	public void getRateOfInterest(){
		
		System.out.println("Rate of Interest = " + roi + "%.");
		
	}

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.getRateOfInterest();

	}

}
