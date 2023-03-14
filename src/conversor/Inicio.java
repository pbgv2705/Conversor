package conversor;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Inicio {
	public static void main(String[] args) {

		JFrame frame = new JFrame("Menu Principal");

		JOptionPane.showMessageDialog(frame, "Bem-vindo ao Sistema Conversor", "Error", JOptionPane.ERROR_MESSAGE);
		// JOptionPane.showMessageDialog(frame, "Message for the dialog box goes
		// here.","Error", JOptionPane.ERROR_MESSAGE);

		frame.setSize(350, 350);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
