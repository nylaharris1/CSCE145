//Nyla Harris
import java.util.Scanner;
public class Homeworkp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner key = new Scanner(System.in);
		
		//Introduction to the game
		System.out.println("Welcome to the Lost Temple Adventure");
		//First decision: choose how to enter the temple
		System.out.println("Do you want to enter through the main gate or the hidden tunnel? \n"
				+"Main gate or Hidden tunnel:");
		String firstChoice = key.nextLine();
		
		
		
		
		if(firstChoice.equals("Main gate")) {
			//Path if the player enters through the Main gate
			System.out.println("The gate creaks open. You see a stairway going down and a hallway going right. Do you want to go down or right? "
					+"Down or Right: ");
			String secondChoice = key.nextLine();
			
			
			if(secondChoice.equals("Down")) {
				//Player finds a chest and must use a numeric comparison
				System.out.println("You find a locked chest. Enter a number code (1-10):");
				int code = key.nextInt();
				key.nextLine();
			
				if(code == 7) {
					System.out.println("The chest opens! You found the treasure. (Ending 1)");
				}else if (code < 7) {
					System.out.println("A trap triggers. You get crushed by rocks... (Ending 2)");
				}else {
					System.out.println("The lock breaks, releasing poisonous gas. (Ending 3)");
				}
				
				
			}else if(secondChoice.equals("Right")) {
				//Player encounters a guard and must choose to fight or run
				System.out.println("You encounter a guard! Do you fight or run? \n"
						+ "Fight or Run:");
				String thirdChoice = key.nextLine();
				
				if(thirdChoice.equals("Fight")) {
					System.out.println("You defeat the guard, but alarms go off. You get captured. (Ending 4)");
				}else {
					System.out.println("You run and find a secret exit. You escape! (Ending 5)");
				}
			}
			
		}else if(firstChoice.equals("Hidden tunnel")) {
			//Path if player chooses to enter through the hidden tunnel
			System.out.println("You crawl through the tunnel and find a fork. Do you go left or right? \n"
					+"Left or Right: ");
			String secondChoice = key.nextLine();
			if(secondChoice.equals("Left")) {
				//Player discovers a mysterious glowing door. (string comparison)
				System.out.println("You find a mysterious glowing door. Do you enter? \n"
						+"Yes or No:");
				String thirdChoice = key.nextLine();
				if(thirdChoice.equals("Yes")) {
					System.out.println("Inside is a cursed necklace. You are cursed forever. (Ending 6)");
				}else {
					System.out.println("You leave it alone and find a cheesy quesadilla to eat with your fork. (Ending 7)");
				}
			}else {
				//Player faces the lava bridge using a compound boolean expression
				System.out.println("You see a bridge over hot lava. Do you cross it? \n"
						+"Yes or No:");
				String thirdChoice = key.nextLine();
				if(thirdChoice.equals("Yes")) {
					//Example of compound boolean
					boolean hasRope = true;
					boolean steady = false;
					if(hasRope && !steady) {
						System.out.println("You slip but use the rope to make it to the other side. (Ending 8)");
					}else {
						System.out.println("You fall into the hot lava. Game over. (Ending 8)");
					}
					
				}else {
					System.out.println("You turn back and get trapped. You are sealed in.. (Ending 9)");
				}
			}
		}else {
			//Invalid input at the very first choice
			System.out.println("You hesitate too long.. and a trap activates below you shooting out sprinkles and slime. (Ending 10)");
		}
		
		
	key.close();
	//End of game
	
	//1. Main gate, Down, 7
	//2. Main gate, Down, 1-6
	//3. Main gate, Down, 8-10
	//4. Main gate, Right, Fight
	//5. Main gate, Right, Run
	//6. Hidden tunnel, Left, Yes
	//7. Hidden tunnel, Left, No
	//8. Hidden tunnel, Right, Yes
	//9. Hidden tunnel, Right, No
	//10. hidden tunnel or main gate lowercase
	}

}
