package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class choosestory {
	public static void main(String[] args) {
		int task1 = JOptionPane.showOptionDialog(null,
				"It is 7 in the morning and you hear your alarm clock wake you up with the  constanly beeping noise,"
				+ " what do you choose to do",
				"Choice", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "wake up", "sleep" }, null);

		if (task1 == 1) {
			JOptionPane.showMessageDialog(null,
					"at that moment, a fire goes in your building but you are already too late, you died");
		}
		else if (task1 == 0) {
			int task2 = JOptionPane.showOptionDialog(null,
					"lucky for you, you were able to get out just in time, but the fire is still spreading and now rages into your room, what do you think you should do",
					"Choice", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "grab the fire estinguisher", "go out the back way" }, null);
			if (task2 == 0) {
				task2 = JOptionPane.showOptionDialog(null, "You grab the fire estinguisher to see that the top is jamed,"
						+ " the fire though slowly rages towards you. ", "choice",0,JOptionPane.INFORMATION_MESSAGE,null,new String[] {"run", "unplug it"},null); 
				if (task2==1) {
					JOptionPane.showMessageDialog(null,"you are too late, the fire rushes towards you and it will not unplug. The fire finally slowly reaches you and you meet your fate"); 
					System.exit(0);
				}
			} else if (task2 == 1) {
				JOptionPane.showMessageDialog(null,
						"you go out your back door and jump out hoping that there is something to land on, lucky for you, you land in a garbage can, you are hurt, but you survived");
				System.exit(0);
			}

			int task3 = JOptionPane.showOptionDialog(null, "you hastily make your way to the roof of the building to find that you are surrounded by fire, you see a fireschute next to you and to see an old rope, both options do not look to promising but they might just work out.", "Choice", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "fireschute", "old rope" }, null);
			if (task3 == 0) {
				JOptionPane.showMessageDialog(null, "the fireschute breaks under all the pressure of you, and you see yourself fall to the ground, you did not survive");
				System.exit(0);
			} else if (task3 == 1) {
				JOptionPane.showMessageDialog(null, "suprisingly, the old age of the rope had not fully whorn it down, you slide down to safety watching the whole building light ablaze, you truly are lucky enough to survive");
			System.exit(0);
			}
		
			}
		}
	}
