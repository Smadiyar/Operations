package car;

import java.util.Arrays;

public class Car {

	
	String make;
	String model;
	int year;
	double currentSpeed;
	boolean isRunning;
	
	public void Start () {
		isRunning=true;	
	}
	public void Stop() {
		isRunning=false;
	}
	public void accelerate(int speed ) {
		for(double i=currentSpeed;i<=speed; i++ ) {
			System.out.print(i+" ");
		}
		currentSpeed=speed;
	}
	
	public void slowDown(int speed) {
		for(double i=currentSpeed; i>speed; i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		currentSpeed=speed;
	}
	
	public String getCarInfo() {
		return make+" "+model+" "+year;
	}
	
	public void getDirections(String direction1, String direction2, String direction3) {
		System.out.println("Turning "+direction1);
		System.out.println("Turning "+direction2);
		System.out.println("Turning "+direction3);
	}
	public long getTotalDistance(long[] distances) {
		long sum=0;
		for(long distance : distances) {
			sum+=distance;
		}
		return sum;
	}
	
	public long getMaxDistance(long[] distances) {
		Arrays.sort(distances);
		return distances[distances.length-1];
	}
	
	
	public long[] removeLongestDistance(long[]distances) {
		Arrays.sort(distances);
		long[] newArray=new long[distances.length-2];
		for(int i=1,count=0; i<distances.length-1; i++, count++) {
			newArray[count]=distances[i];
		}
		return newArray;
	}
	
	
	
	
	
}
