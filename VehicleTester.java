/**
 * 
 */

/**
 * @author David Renard
 *
 */
public class VehicleTester {

	/**
	 * 
	 */
   public static void main(String[] args) {
	   
	   Vehicle myVehicle = new Vehicle(3000,4);
	   
	   System.out.println("The horsepower is " + myVehicle.getHorsepower());
	   System.out.println(myVehicle.toString());
	   
	   Car myCar = new Car(2500, 4, "Blue", 4);
	   System.out.println(myCar);
	   
	   Truck myTruck = new Truck(7000, 4, 33895, 2);
	   System.out.println(myTruck);
		
	}

}
