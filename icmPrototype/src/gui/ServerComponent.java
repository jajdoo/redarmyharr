package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;

import server.ICMServer;

public class ServerComponent extends JComponent implements Observer, ActionListener
{
	private JTextField portField;
	private JTextArea outputArea;
	private ICMServer server;
	
	public ServerComponent() {
		
		JLabel lblPort = new JLabel("port");
		lblPort.setBounds(85, 66, 46, 14);
		add(lblPort);
		
		portField = new JTextField();
		portField.setBounds(141, 63, 86, 20);
		add(portField);
		portField.setColumns(10);
		
		outputArea = new JTextArea();
		outputArea.setBounds(86, 108, 258, 182);
		add(outputArea);
		
		JButton btnNewButton = new JButton("start server");
		btnNewButton.setBounds(235, 62, 109, 23);
		add(btnNewButton);
		btnNewButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		server = new ICMServer(Integer.parseInt(portField.getText()));
		server.addObserver(this);
		try 
		{
			server.listen();
		}
		catch (IOException ex) {outputArea.append(ex.getMessage());}
	}
	
	public void update(Observable arg0, Object arg1) 
	{
		if(arg0.equals(server) && arg1 instanceof String)
		{
			outputArea.append((String)arg1);
		}
	}
	
	
}
