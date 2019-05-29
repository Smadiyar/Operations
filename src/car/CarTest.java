package car;

public class CarTest {
	public static void main(String[] args) {
		
		Car cr=new Car();
		
		cr.make="Camry";
		cr.model="Toyota";
		cr.year=2017;
		cr.currentSpeed=55;
	
		
		cr.Start();
		cr.accelerate(65);
		cr.slowDown(60);
		System.out.println(cr.getCarInfo());
		
		cr.getDirections("right", "left", "right" );
		
		long[] distances= {2,5,22,66,8,1};
		System.out.println(cr.getTotalDistance(distances));
		System.out.println(cr.getMaxDistance(distances));
		
		long[] newDistance=cr.removeLongestDistance(distances);
		for(long d : newDistance) {
			System.out.print(d+ " ");
		}
		
	}

}
