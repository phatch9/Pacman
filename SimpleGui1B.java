
import javax.swing.*;
import java.awt.event.*;

public class Action implements ActionListener {
	JButton button1,button2;

	public static void main(String[] args) {
		Action gui = new Action();
		gui.go();
	}

	public void go() {
		JFrame frame = new JFrame();
		button1 = new JButton("click me");
		button2 = new JButton("Hello");
		button1.addActionListener(this);
		frame.getContentPane().add(button1);
		//frame.getContentPane().add(button2);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
