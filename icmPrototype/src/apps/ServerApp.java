package apps;

import gui.ServerComponent;

import javax.swing.JFrame;


/**
 * runner for server
 * @author Ni
 *
 */
public class ServerApp 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ServerComponent());
		frame.setVisible(true);
	}

}
