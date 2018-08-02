package InterfaceAssignmentVehicle;

public class VDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle[] vehicles = new Vehicle[3];
		// creating object four for four wheeler class and store four wheeler object it
		// in array of interface
		vehicles[0] = new Fourwheeler();
		// creating object two for Two wheeler class and store two wheeler object it in
		// array of interface
		vehicles[1] = new TwoWheeler();
		// creating object three for Three wheeler class and store three wheeler object
		// it in array of interface
		vehicles[2] = new ThreeWheeler();
		for (int i = 0; i < 3; i++) {
			// check three class exist or not
			if (vehicles[i].getClass().getSimpleName().equals("ThreeWheeler")) {
				vehicles[i].start();// call three wheeler class start method
			}
		}
	}

}
