package apps;
import gui.ClientComponent;

import java.io.IOException;

import javax.swing.JFrame;

import client.ICMClient;


public class ClientApp 
{
	public static void main(String[] args) 
	{
		
		JFrame frame = new JFrame();
		frame.setSize(400,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ClientComponent());
		frame.setVisible(true);
	}

}
