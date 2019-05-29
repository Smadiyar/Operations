package Techtorial;

public class Home {
	
	int size;
	int floor;
	int bedroom;
	int livingroom;
	int restroom;
	boolean garden;
	String name;
	String color;
	int window;
	int door;
	int temperature;
	int gardenLength;
	int gardenWidth;
	int gardenArea;
	
	
	public int increaseTemp (int incTemp) {
		temperature=temperature+incTemp;
		//System.out.println("Please check the temperature. If it is too cold turn on the heater");
		return temperature;
	}
	
	public int decreaseTemp (int decTemp) {
		temperature=temperature-decTemp;
		//System.out.println("Please check the temperature. If it is too hot turn off the heater");
		return temperature;
	}
	
	
	public int gardenSize (boolean checkGarden, int lenghtOfGarden, int widthOfGarden) {
	if(checkGarden==true) {
		gardenArea=lenghtOfGarden*widthOfGarden;
	}
		return gardenArea;
	}
	
	

}
