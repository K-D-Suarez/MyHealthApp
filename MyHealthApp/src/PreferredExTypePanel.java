import javax.swing.*;
import java.awt.*;

/**
 * The PreferredExTypePanel allows the user to select
 * their preferred exercise type.
 */
public class PreferredExTypePanel extends JPanel
{
	private JRadioButton abdominals;
	private JRadioButton biceps;
	private JRadioButton calves;
	private JRadioButton chest;
	private JRadioButton glutes;
	private JRadioButton quadriceps;
	private ButtonGroup bg;
	
	/**
	 * Constructor
	 */
	public PreferredExTypePanel()
	{
		// Create a GridLayout manager with
		// four rows and one column
		setLayout(new GridLayout(4, 1));
		
		// Create the radio buttons
		abdominals = new JRadioButton("Abdominals");
		biceps = new JRadioButton("Biceps");
		calves = new JRadioButton("Calves");
		chest = new JRadioButton("Chest");
		glutes = new JRadioButton("Glutes");
		quadriceps = new JRadioButton("Quadriceps");
		
		
		// Group the radio buttons
		bg = new ButtonGroup();
		bg.add(abdominals);
		bg.add(biceps);
		bg.add(calves);
		bg.add(chest);
		bg.add(glutes);
		bg.add(quadriceps);
		
		// Add a border around the panel
		setBorder(BorderFactory.createTitledBorder("Which muscle group?"));
		
		// Add the radio buttons to the panel
		add(abdominals);
		add(biceps);
		add(calves);
		add(chest);
		add(glutes);
		add(quadriceps);
	}
}
