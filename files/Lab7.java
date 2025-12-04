//Nyla Harris
import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creates a new scanner project
		Scanner key = new Scanner(System.in);
		double[] prices = new double[7];
		double sum = 0;
		
		//allow user to enter the gas prices for 7 days.
		for(int i = 0; i < 7; i++) {
			System.out.print("Enter the gas price (per gallon) on Day " + (i + 1) + ": ");
			prices[i] = key.nextDouble();
			sum += prices[i];
		}
		
		//compute the average price for the 7 days
		double average = sum / 7;
		System.out.printf("The average price for 1 gallon of gas during the last 7 days = $%.2f\n", average);
		
		//print days where the price was above average
		System.out.println("The price was above average on:");
		for(int i = 0; i < 7; i++) {
			if (prices[i] > average) {
				System.out.printf(" Day %d: $%.2f\n", (i + 1), prices[i]);
			}
		}
		//closes code
		key.close();		
	}

}
