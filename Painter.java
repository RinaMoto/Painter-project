import java.awt.BorderLayout;
import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;

public class Painter {
	public static void main(String[] args)
	{
		JFrame application = new JFrame("simple paint application");
		
		JPanel paintPanel = new PaintPanel();
		application.add(paintPanel, BorderLayout.CENTER);
        
		
		
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.setSize(500, 500);
        application.setVisible(true);
		
		
		
	}
}


