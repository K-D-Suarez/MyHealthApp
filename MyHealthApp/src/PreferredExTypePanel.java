import javax.swing.*;
import java.awt.*;

/**
 * The PreferredExTypePanel allows the user to select
 * their preferred exercise type.
 */
public class PreferredExTypePanel extends JPanel
{
	private JRadioButton bodyWeightExercises;
	private JRadioButton bodyWeightAndEquipmentEx;
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
		bodyWeightExercises = new JRadioButton("Bodyweight exercises");
		bodyWeightAndEquipmentEx = new JRadioButton("Bodyweight and exercise equipment exercises");
		
		// Group the radio buttons
		bg = new ButtonGroup();
		bg.add(bodyWeightExercises);
		bg.add(bodyWeightAndEquipmentEx);
		
		// Add a border around the panel
		setBorder(BorderFactory.createTitledBorder("What type of exercises would you prefer?"));
		
		// Add the radio buttons to the panel
		add(bodyWeightExercises);
		add(bodyWeightAndEquipmentEx);
	}
}
