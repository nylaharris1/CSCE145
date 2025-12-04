//Nyla Harris
import java.util.Scanner;

public class Homework4 {

		// converting meters to kilometers (also displays the result)				
		public static void showKilometers(double meters) {
			double kilometers = meters * 0.001;
			System.out.println(meters + "meters = " + kilometers + " kilometers");
		}
		
		//converting meters to inches (also displays the result)
		public static void showInches(double meters) {
			double inches = meters * 39.37;
			System.out.println(meters + "meters = " + inches + " inches");
		}
		
		//converting meters to feet (also displays the result)
		public static void showFeet(double meters) {
			double feet = meters * 3.281;
			System.out.println(meters + "meters = " + feet + " feet");
		}
		
		public static void main(String[] args) {
			Scanner key = new Scanner(System.in);
			double meters;
			//ask the user for the distance
			System.out.print("Enter a distance in meters: ");
			meters = key.nextDouble();
			//validate that the distance is not negative
			if (meters < 0) {
				System.out.println("Error: Distance cannot be negative. Exiting the program.");
				System.exit(0);
			}
			int choice = 0;
			
			//Display the menu until the user decides to quit
			while(choice != 4) {
				System.out.println();
				System.out.println("1. Convert to kilometers");
				System.out.println("2. Convert to inches");
				System.out.println("3. Convert to feet");
				System.out.println("4. Quit the program");
				System.out.print("Enter your choice (1-4): ");
				choice = key.nextInt();
				
				if(choice == 1) {
					showKilometers(meters);
				}
				else if (choice == 2) {
					showInches(meters);
				}
				else if (choice == 3) {
					showFeet(meters);
				}
				else if (choice == 4) {
					System.out.println("Program ended");
				}
				else {
					System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
				}
			}
		key.close();
		//closes cooe
		}
		
	}


