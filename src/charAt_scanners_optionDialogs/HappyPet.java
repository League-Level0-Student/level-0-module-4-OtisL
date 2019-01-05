package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0;
	static String pet;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		pet = JOptionPane.showInputDialog("What kind of pet do you want to get?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int k=0;k<8;k++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your pet happy?", "Make your pet Happy!", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Give food", "Give water", "Clean living area" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			//System.out.println(task);
			if(task==0) {
				food();
			}
			if(task==1) {
				water();
			}
			if(task==2) {
				clean();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
			if (happinessLevel>=6) {
				JOptionPane.showMessageDialog(null, "Your "+pet+" loves you!");
				break;
			}
		}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static void food() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" loved the food and devoured it.");
		happinessLevel++;
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" drank all of the water and is now happy.");
		happinessLevel++;
	}
	static void clean() {
		JOptionPane.showMessageDialog(null, "Your "+pet+" loves his/her new clean living area.");
		happinessLevel++;
	}
}