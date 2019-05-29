package samples;

public class mathHelpTest {
	public static void main(String[] args) {
		
	mathHelp mathHelp = new mathHelp();
	
		System.out.println("Sum of the numbers: " + mathHelp.sum(2, 5));
		System.out.println(mathHelp.sabstract(9, 5));
		System.out.println(mathHelp.multiple(5, 5));
		System.out.println(mathHelp.divide(5, 2));
		
		
		
		mathHelp.c=10;
		mathHelp.d=5;
		System.out.println(mathHelp.sumNoParameters());
	}

}
