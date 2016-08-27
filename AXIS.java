public class AXIS extends Bank {
	
	int roi;
	
	AXIS(){
		
		roi = 9;
		
	}
	
	public void getRateOfInterest(){
		
		System.out.println("Rate of Interest = " + roi + "%.");
		
	}

	public static void main(String[] args) {
		
		AXIS axis = new AXIS();
		axis.getRateOfInterest();

	}

}

