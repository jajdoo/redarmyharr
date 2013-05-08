package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.JButton;

import client.ICMClient;

public class ClientComponent extends JComponent implements ActionListener, Observer
{
	private JTextField ipField;
	private JTextField portField;
	private JTextArea outputText;
	
	private ICMClient client;
	
	public ClientComponent() 
	{
		
		ipField = new JTextField();
		ipField.setBounds(112, 43, 165, 20);
		add(ipField);
		ipField.setColumns(10);
		
		portField = new JTextField();
		portField.setBounds(112, 74, 165, 20);
		add(portField);
		portField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ip");
		lblNewLabel.setBounds(56, 46, 46, 14);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("port");
		lblNewLabel_1.setBounds(56, 77, 46, 14);
		add(lblNewLabel_1);
		
		outputText = new JTextArea();
		outputText.setBounds(56, 139, 232, 156);
		add(outputText);
		
		JButton btnNewButton = new JButton("connect");
		btnNewButton.setBounds(188, 105, 89, 23);
		add(btnNewButton);
		btnNewButton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) 
	{
		this.client = new ICMClient(ipField.getText(), Integer.parseInt(portField.getText()));
		client.addObserver(this);
		
		try 
		{
			client.openConnection();
			client.sendToServer("greetings!");
		} 
		catch (IOException ex) {outputText.append(ex.getMessage());}
	}

	public void update(Observable arg0, Object arg1) 
	{
		if(arg0.equals(client) && arg1 instanceof String )
		{
			outputText.append((String)arg1);
		}
	}
	
	
}
