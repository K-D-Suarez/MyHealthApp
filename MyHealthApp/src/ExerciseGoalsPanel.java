import javax.swing.*;
import java.awt.*;

/**
 * The ExerciseGoalsPanel class allows the user to select
 * exercise goals.
 */
public class ExerciseGoalsPanel extends JPanel
{
	private JCheckBox buildMuscle;
	private JCheckBox cardiovascularHealth;
	private JCheckBox loseWeight;
	private JCheckBox increaseStrength;
	
	/**
	 * Constructor
	 */
	public ExerciseGoalsPanel()
	{
		// Create a GridLayout manager with
		// four rows and one column.
		setLayout(new GridLayout(4, 1));
		
		// Create the check boxes
		buildMuscle = new JCheckBox("Build muscle");
		cardiovascularHealth = new JCheckBox("Improve cardiovascular health");
		loseWeight = new JCheckBox("Lose weight");
		increaseStrength = new JCheckBox("Increase overall strength");
		
		// Add the border around the panel
		setBorder(BorderFactory.createTitledBorder("What are your exercise goals?"));
		
		// Add the check boxes to the panel
		add(buildMuscle);
		add(cardiovascularHealth);
		add(loseWeight);
		add(increaseStrength);
	}
	
}
