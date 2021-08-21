package Week3.Day1;

public class ExecutionClass {

	public static void main(String[] args) {
		Vehicle vehobj = new Vehicle();
		vehobj.acclerate();
		vehobj.applyBreak();
		vehobj.drivevehicle();
		vehobj.soundHorn();
		System.out.println("---------------------");
	 Car carObj = new Car();
	 carObj.pushOnAirbag();
	 carObj.acclerate();
	 carObj.applyBreak();
	 carObj.drivevehicle();
	 carObj.soundHorn();
	 int numOfWheels = carObj.numOfWheels;
	 System.out.println("noOf Wheels In Car"+numOfWheels);
	 System.out.println("------------------------");
	 Auto autoObj = new Auto();
	 int numOfWheels2 = autoObj.numOfWheels;
	 System.out.println("NoOfWheels In a Car"+numOfWheels2);
	 
	 BMW bmw = new BMW();
	 bmw.acclerate();
	 bmw.applyBreak();
	 bmw.drivevehicle();
	 bmw.soundHorn();
	 int numOfWheels3 = bmw.numOfWheels;
	System.out.println("NoOfWheels  "+ numOfWheels3);	
	}

}
