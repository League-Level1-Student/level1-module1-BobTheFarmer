package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Converter implements ActionListener {
	JFrame frame = new JFrame("Convert the 1 and 0 thingy to like english but only put in 8 didgets");
	JPanel panel = new JPanel();
	JTextField input = new JTextField(20);
	JButton button = new JButton("Convert");
	void run() {
		frame.setVisible(true);
		frame.add(panel);
		panel.add(input);
		button.addActionListener(this);
		panel.add(button);
		frame.pack();
	}

	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, convert(input.getText()));
	}
	
	
	
	String convert(String input) {
        if(input.length() != 8){
             JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
             return "-";
        }
        String binary = "[0-1]+";    //must contain numbers in the given range
        if (!input.matches(binary)) {
             JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
             return "-";
        }
        try {
             int asciiValue = Integer.parseInt(input, 2);
             char theLetter = (char) asciiValue;
             return "" + theLetter;
        } catch (Exception e) {
             JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
             return "-";
        }
   }
}
