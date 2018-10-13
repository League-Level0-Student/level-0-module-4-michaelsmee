package doubles_and_booleans;

import javax.swing.JOptionPane;

public class testscore {
public static void main(String[] args) {
String t = JOptionPane.showInputDialog("what was the test  score you got?");	
	int x =Integer.parseInt(t);
	if (x > 80 && x<101) {
	JOptionPane.showMessageDialog(null, "good job, you passed");	
	}
	else if (x<80 && x>0) {
		JOptionPane.showMessageDialog(null, "come on, are you trying");
	}
	else if (x<0 || x>100)
		JOptionPane.showMessageDialog(null, "liar!");
}
}


