package TReplit;

import java.util.Arrays;
import java.util.Scanner;

public class ReplIIIIIIIt {
	public static void main(String[] args) {
	Scanner tr=new Scanner (System.in);
	
	//TAsk1
//	System.out.println("Please enter any word: ");	
//	String word=tr.next();
//		
//	char ch = word.charAt(word.length()-1);
//	System.out.println(ch+word+ch);	
//		

	//Task2
//	
//	System.out.println("Please enter any word: ");
//	String word = tr.next();
//	String ch="";
//	for(int i=0; i<word.length(); i++) {
//		for(int j = i+1; j<word.length(); j++) {
//			if(word.charAt(i)==(word.charAt(j))) {
//				ch=word.charAt(i)+ "";	
//			}
//			
//		}
//		
//	}
//	not done!!!!!
//	System.out.println(ch);
	
	
	//Task3
	
//	System.out.println("Please enter any words: ");
//	String word = tr.next();
//	int lastIndex=word.length()-1;
//	boolean check=true;
//	
//	for(int i = 0; i < word.length(); i++) {
//		if(word.charAt(i) != word.charAt(lastIndex)) {
//			System.out.println("Not palindrome");
//			check = false;
//			break;
//		}
//		lastIndex--;
//	}
//	if(check) {
//		System.out.println("Palindrome");
//	}
			
	
	
	
	//TAsk4
	
	
//	
//	String[] arr= {"zero", "one", "two", "three", "four", "zero"};
//	String [] few=new String[arr.length];
//	int count=0;
//	
//	for(int i=0; i<arr.length; i++) {
//		if(arr[i].contains("e")) {
//			few[count++]=arr[i];
////			System.out.print(arr[i]);
//			
//		}
//			
//		}
//	Arrays.sort(arr);
//	System.out.println(Arrays.toString(few));
//	
	
	
	//Task5
	
//	String [] arr = new String[3];
//	System.out.println("Please enter 3 words: ");
//	
//	for(int i=0; i<3; i++) {
//		arr[i]=tr.nextLine();
//	}System.out.println(Arrays.toString(arr));
//	for(int i=0; i<arr.length; i++) {
//		
//		System.out.println(arr[i].substring(0, 3));
//	}
	
	
	//Task6

//	System.out.println("Please enter your email: ");
//    String str =tr.nextLine();
// 
//	String[] str2=str.split("@");
//	for(String i: str2) {
//		
//	}
//	System.out.println("id:" + str2[0]);
//	System.out.println("domain: " + str2[1]);
//	
	
	
	
	//Task7
	
//	
//	System.out.println("Please enter sentence: ");
//     String str =tr.nextLine();
//
//	String[] str2=str.split(" ");
//	
//	
//	for(String i: str2) {
//		System.out.println(i);
//	}
//	
	
	//Task8
	
	
//	System.out.println("Please enter sentence: ");
//    String str =tr.nextLine();
//
//	String[] str2=str.split(" ");
//	
//	for(int i=str2.length-1; i>=0; i--) {
//		System.out.println(str2[i]+ " ");
//	}
//	
	
	
	
	//Task9
	
	
	
	
  System.out.println("Please enter 5 words: ");
  String[] str = new String [5];
//  String str2=" ";
//  char chFirst, chLast;
  
  
  
  for(int i=0; i<str.length; i++) {
	  str[i]=tr.nextLine();  
  }	
  System.out.println(Arrays.toString(str));
  
  
  for(int i=0; i<str.length; i++) {
//	  for(int j=0; j<str[i].length();j++);
//	 str2=str[i];
//	chFirst=str2.charAt(0);
//	chLast=str2.
System.out.println(str[i].substring(0, 1) + str[i].substring(str[i].length()-1)); 
	 
  }
  	
	
	
	
	
	
	
	
	
		
	
	
	}

}
