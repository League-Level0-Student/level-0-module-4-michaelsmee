package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String n = JOptionPane.showInputDialog("how many nickels do you have");
		// Convert their answer to an int using Integer.parseInt()
int nickels=Integer.parseInt(n);
		// Ask the user how many dimes they have, and convert their answer
String d = JOptionPane.showInputDialog("ho wmany dimes do you have");
int dime=Integer.parseInt(d);
		// Ask the user how many quarters they have, and convert their answer
String q=JOptionPane.showInputDialog("how many quarters do you have");
int quarters=Integer.parseInt(q);
		// Calculate how much money the user has and save it in a double variable 
double m,y,p,money;
m=nickels;
y=dime;
p=quarters;
money=m/20+y/10+p/4;
		// Tell the user how much money they have
System.out.println(money);
	JOptionPane.showMessageDialog(null, money);
	}
}

