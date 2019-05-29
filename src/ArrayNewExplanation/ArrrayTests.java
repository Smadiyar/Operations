package ArrayNewExplanation;

public class ArrrayTests {
	public static void main(String[] args) {
		
//		String[] names= {"Arslan", "Muammer", "Tima", "tima", "arslan"};
//		
//		for(int i=0;i<names.length;i++){
//			
//		  for(int j=i+1; j<names.length; j++) {
//			if(names[i].equalsIgnoreCase(names[j])) {
//				System.out.println("Duplicated names are: " + names[j]);
//			}
//			
//		}
//		
//		}
		
		
		String[] names= {"Arslan", "Muammer", "Tima", "tima", "arslan"};
		
		String reversed = " ";
		
		for(int i=0; i<names.length; i++) {
//			System.out.print(names[i]);
		}
		for(int i=names.length-1; i>=0; i--) {
			String [] reversed1 = new String[i];
			reversed=reversed+names[i]+" ";
			
		}
		
		System.out.println(reversed.trim());
		
	}

}
