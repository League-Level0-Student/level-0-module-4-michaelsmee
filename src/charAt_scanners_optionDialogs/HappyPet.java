package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int hapinessLevel = 0;
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String Pet = JOptionPane.showInputDialog("what PeT dO yOU wAnt To boI(?)");
		
// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 6; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do", "Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "wash", "video tape for memes", "feed" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task==0) {
wash();
}
if(task==1) {
videotapeformemes();
}

if(task==2) {
feed();	
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	if (hapinessLevel ==5) {
	break;
	}
		}

	
	
	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}

		
			
	



public static void wash() {
	JOptionPane.showMessageDialog(null, "dog is wet");
	hapinessLevel=+1;
}
public static void videotapeformemes() {JOptionPane.showMessageDialog(null, "dog feeling mlg");
hapinessLevel=+10;
}
public static void feed() {
	JOptionPane.showMessageDialog(null, "dog is full");
hapinessLevel=+1;
}
}





