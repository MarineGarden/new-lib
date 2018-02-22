package display;

import java.awt.Color;
import java.awt.Container;
import java.awt.Rectangle;

import javax.swing.JFrame;

public class StandardFrame extends JFrame {
	
	private final Container content = getContentPane();
	
	public StandardFrame(Rectangle size) {
		content.setBackground(Color.WHITE);
		setBounds(size.x, size.y, size.width, size.height);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StandardFrame test = new StandardFrame(new Rectangle(100, 100, 300, 300));
		test.setTitle("     test");
	}

}
