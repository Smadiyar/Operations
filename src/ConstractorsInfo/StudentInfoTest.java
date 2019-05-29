package ConstractorsInfo;

public class StudentInfoTest {
	public static void main(String[] args) {
		
	
	StudentInfo student = new StudentInfo("Tangsholpan", "Smadiyar");
	StudentInfo student2 = new StudentInfo(3/29/1995, "Shymkent");
	StudentInfo student3 = new StudentInfo("Teacher", "Dancing", "Not Math");
	StudentInfo student4 = new StudentInfo(872230090);
	StudentInfo student5 = new StudentInfo("Kazashka");
	StudentInfo student6 = new StudentInfo('F');
	
	System.out.println(student2);
	
	
	}
}
