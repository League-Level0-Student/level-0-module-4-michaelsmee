package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class choosestory {
	public static void main(String[] args) {
		int task1 = JOptionPane.showOptionDialog(null, "What do you want to do", "Choice", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "wake up", "sleep" }, null);

		if (task1 == 1) {
			JOptionPane.showMessageDialog(null, "You got killed by dumb memes");
		}
		if (task1 == 0) {
			int task2 = JOptionPane.showOptionDialog(null, "What do you want to do", "Choice", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "eat", "go to work" }, null);
			if (task2 == 0) {
			}
			if (task2==1) {JOptionPane.showMessageDialog(null,"yo yo ucool, u surviv");}
			int task3 = JOptionPane.showOptionDialog(null, "What do you want to do", "Choice", 0,
					JOptionPane.INFORMATION_MESSAGE, null, new String[] { "pet tEh CaT", "call seanjedimaster" }, null);
			if (task3==0) {JOptionPane.showMessageDialog(null, "the cat bites you ouch, you do not survive");}
			if (task3==0) {JOptionPane.showMessageDialog(null, "you survived");}
			int task4=JOptionPane.showConfirmDialog(null, "did you survive?");
			if(task4==0) {JOptionPane.showMessageDialog(null,"good for you");}
			if(task4==1) {JOptionPane.showMessageDialog(null, "nooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooob");}
		}
	}
}