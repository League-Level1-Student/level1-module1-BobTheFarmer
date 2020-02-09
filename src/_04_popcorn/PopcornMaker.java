package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	/* Your mission and you have to accept it:
	 * Create a PopcornMaker class (in the popcorn package) and add a main method to it. 
	 * The main method should create a bag of Popcorn and cook it in the microwave.
	 * Ask the user for the flavor of the popcorn and the number of minutes to cook it.
	 * Don't change the existing methods.
	 */
	public static void main(String[] args) {
		Popcorn popcorn = new Popcorn(JOptionPane.showInputDialog(null, "What flavor shouold your popcorn be?"));
		Microwave microwave = new Microwave();
		microwave.putInMicrowave(popcorn);
		int time = Integer.parseInt(JOptionPane.showInputDialog(null, "How long do you cook it?"));
		microwave.setTime(time);
		microwave.startMicrowave();
	}
}
