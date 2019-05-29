package ConstractorsInfo;

public class JordanTest {
	public static void main(String[] args) {
		
		Jordan person = new Jordan();
		Jordan person2 = new Jordan(35);
		Jordan person3 = new Jordan("Good", 11, "Music");
		Jordan person4 = person;
		Jordan person5 = new Jordan("Gerald", "Green", "45");
		System.out.println(person);
		
	}

}
