package week1.day2;

public class Twowheeler {
		// TODO Auto-generated method stub
		//Assignment 3: Create a TwoWheeler class and print its variables
		
			int noOfWheels = 2;
		    short noOfMirrors = 2;
		    long chassisNumber = 123456789L;
		    boolean isPunctured = false;
		    String bikeName = "MyBike";
		    double runningKM = 100.5;

		    public static void main(String[] args) {
		        Twowheeler myBike = new Twowheeler();
		        System.out.println("Number of wheels: " + myBike.noOfWheels);
		        System.out.println("Number of mirrors: " + myBike.noOfMirrors);
		        System.out.println("Chassis number: " + myBike.chassisNumber);
		        System.out.println("Is punctured? " + myBike.isPunctured);
		        System.out.println("Bike name: " + myBike.bikeName);
		        System.out.println("Running KM: " + myBike.runningKM);
		    }
		
	}


