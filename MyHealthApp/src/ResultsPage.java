import javax.swing.*;
import java.awt.*;

public class ResultsPage 
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Your Custom Exercise Routine");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		
		// Create a JPanel to hold a list of labels
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		// Create a JScrollPann and set the panel as its viewport
		JScrollPane scrollPane = new JScrollPane(panel);
		
//		//Add a large number of labels to the panel
//		for (int i = 1; i <= 50; i++)
//		{
//			JLabel label = new JLabel ("Label " + i);
//			panel.add(label);
//		}
		
		// Add the JScrollPane to the frame
		frame.add(scrollPane);
		frame.setVisible(true);
	}
	
}
