package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class choosestory {
public static void main(String[] args) {

	int task=JOptionPane.showConfirmDialog(null, "Do you wake up");
if(task==1) {JOptionPane.showMessageDialog(null, "sean says; die");
}	
if(task==0)	{JOptionPane.showConfirmDialog(null, "go to work");
}
if(task==1) {JOptionPane.showMessageDialog(null, "yo, you died");}
if(task==0) {JOptionPane.showConfirmDialog(null, "do you bike home");}
if(task==1) {JOptionPane.showMessageDialog(null, "yo, v sauce u slept and died");}
if(task==0) {JOptionPane.showConfirmDialog(null, "do you play video games");}
}
}
