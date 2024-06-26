import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * The StartingPage class creates the GUI for the MyFitnessApp
 * application.
 */

public class StartingPage extends JFrame
{
	private ExerciseGoalsPanel exerciseGoals;     // Exercise goals panel
	private PreferredExTypePanel preferredExType; // Preferred exercise type panel
	private GreetingPanel banner;                 // To display a greeting
	private JPanel buttonPanel;                   // To hold the buttons
	private JButton exitButton;                   // To exit the application
	
	/**
	 * Constructor
	 */
	public StartingPage()
	{
		// Display a title
		setTitle("My Fitness App");
		
		// Specify an action for the close button
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a BorderLayout manager
		setLayout(new BorderLayout());
		
		// Create the custom panels
		banner = new GreetingPanel();
		exerciseGoals = new ExerciseGoalsPanel();
		preferredExType = new PreferredExTypePanel();
		
		// Create the button panel
		buildButtonPanel();
		
		// Add the components to the content pane
		add(banner, BorderLayout.NORTH);
		add(exerciseGoals, BorderLayout.CENTER);
		add(preferredExType, BorderLayout.SOUTH);
		
		// Pack the contents of the window and display it
		pack();
		setVisible(true);		
	}
	
	/**
	 * The buildButtonPanel builds the button panel
	 */
	
	private void buildButtonPanel()
	{
		// Create a panel for the buttons
		buttonPanel = new JPanel();
		
		// Create the buttons
		exitButton = new JButton("Exit");
		
		// Register the action listener
		exitButton.addActionListener(new ExitButtonListener());
		
		// Add the button to the button panel
		buttonPanel.add(exitButton);
	}
	
	/**
	 * Private inner class that handles the event when the
	 * user clicks the Exit button. 
	 */
	
	private class ExitButtonListener implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	/**
	 * main method
	 */
	public static void main (String[] args)
	{
		new StartingPage();
	}
}
