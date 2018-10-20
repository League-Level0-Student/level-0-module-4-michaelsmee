package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017

//    Level 0

import javax.swing.JOptionPane;

public class SleepyHead {

	public static void main(String[] args) {

		boolean isWeekday, isVacation;

		/* You MUST use the above boolean variables in your code */

		// Ask the user for these values using a confirm dialog like the one below
		int week = JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
		System.out.println(week);
		if (week == 1) {
			isWeekday = false;
		} 
		else {
			isWeekday = true;
		}
		
		int vacation = JOptionPane.showConfirmDialog(null, "Is it a vacation", "sleep in", JOptionPane.YES_NO_OPTION);
		if (vacation == 1) {
			isVacation = false;
		} else {
			isVacation = true;
		}
		
		
		if (isVacation == true && isWeekday == false) {
			JOptionPane.showMessageDialog(null, "sleep");
		}
		if (isVacation == false && isWeekday == true) {
			JOptionPane.showMessageDialog(null, "time to get up");
		}
	}
}

/*
 * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday, print
 * “get up lazybones!�? If it is a weekday, and we are on vacation, print “sleep
 * in�?.
 */
