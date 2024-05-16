import javax.swing.*;
import java.awt.*;

/**
 * The ExerciseGoalsPanel class allows the user to select
 * exercise goals.
 */
public class ExerciseGoalsPanel extends JPanel
{
	private JCheckBox cardio;
	private JCheckBox strength;
	private JCheckBox stretching;
	
	/**
	 * Constructor
	 */
	public ExerciseGoalsPanel()
	{
		// Create a GridLayout manager with
		// four rows and one column.
		setLayout(new GridLayout(4, 1));
		
		// Create the check boxes
		cardio = new JCheckBox("Cardio");
		strength = new JCheckBox("Strength");
		stretching = new JCheckBox("Stretching");
		
		
		// Add the border around the panel
		setBorder(BorderFactory.createTitledBorder("What type of exercise?"));
		
		// Add the check boxes to the panel
		add(cardio);
		add(strength);
		add(stretching);
		
	}
	
}
