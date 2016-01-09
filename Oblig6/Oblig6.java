import javax.swing.*;
import java.awt.FlowLayout;

public class Oblig6 extends JFrame
{
	public Oblig6()
	{
		
		this.setSize(10,10);
                this.setTitle("julekalender");
		this.setLayout(new FlowLayout());
		
		this.add(new JButton("Luke 1"));
		
		for(int i = 1; i < 25; i++)
		{
			this.add(new JButton("Luke "+i));
		}
		this.setVisible(true);
	}
}
