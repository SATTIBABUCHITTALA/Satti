

class Vehicle{
	
	String vehicleId;
	String vehicleName;
	int price;
	String vehicleType;
	
	
	//Constructor Over loading
	
	//Default Constructor
	public Vehicle() {
		System.out.println("In Constructor");
		
	}
	
	//Parameterized Constructor.
	//It is used to assign the values of the Class variables at the time of Object Creation. 
	public Vehicle(int rate) {
		price=rate;
		
	}
	
	public Vehicle(String id,String name,int rate,String type) {
		
		vehicleId=id;
		vehicleName=name;
		price=rate;
		vehicleType=type;
		
	}
	
	
	///Constructor will not return anything. 
}



public class ConstructorDemo {
	
	public static void main(String args[]) {
		
		Vehicle vehicle=new Vehicle();
		vehicle.vehicleId="101&*56^@#";
		
		System.out.println(vehicle.vehicleId);
		
		Vehicle vehicle2=new Vehicle(5000);
		
		System.out.println(vehicle2.price);
		
		
		Vehicle vehicle4=new Vehicle();
		vehicle4.vehicleId="190F2";
		vehicle4.vehicleName="TOYOTA";
		vehicle4.price=15000;
		vehicle4.vehicleType="SUV";
		
		
		Vehicle vehicle3=new Vehicle("190F2","TOYOTA",150000,"SUV");
		
		System.out.println("Vehicle Id"+ vehicle3.vehicleId +" Vehicle Name"+ vehicle3.vehicleName
				+" Price"+ vehicle3.price +" Vehicle Type"+ vehicle3.vehicleType);
		
		
		
		
		
		
	}
	

}
