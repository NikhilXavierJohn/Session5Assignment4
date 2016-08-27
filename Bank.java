public class Bank {

	public void getRateOfInterest(){
		
	}
	
	
}

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
