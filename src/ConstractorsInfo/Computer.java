package ConstractorsInfo;

public class Computer {
	
	String brand;
	int year;
	
	public Computer () {
		
	}
    public Computer (String brand) {
		
	}
	
	public Computer (String brand, int year) {
		
	}
	
	 
	
	public static void main (String [] args) {
		
		
		Computer comp = new Computer();
		
		
		comp.brand="MacBook Air";
		comp.year=2012;
		
		
		System.out.println(comp.brand);
		System.out.println(comp.year);
		
		
		
	}
	
	

}
