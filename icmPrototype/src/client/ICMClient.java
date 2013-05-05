package client;

import java.io.IOException;

import hibernate.Class1;
import hibernate.Class2;
import ocsf.client.ObservableClient;

public class ICMClient extends ObservableClient
{
	public ICMClient(String host, int port) 
	{
		super(host, port);
	}

	@Override
	protected void handleMessageFromServer(Object msg) 
	{
		System.out.println("client got message!");
		
		if( msg instanceof Class1 )
		{
			Class1 c1 = (Class1)msg;
			
			System.out.println("server sent Class1 object: ");
			System.out.println(c1.getId1());
			System.out.println(c1.getText());
			
			c1 = Class1.createClass1();
			c1.setText("THIS IS CLIENT OBJECT!");
			
			try 
			{
				System.out.println("client sending Class1 instance to server..");
				sendToServer(c1);
			}
			catch (IOException e) {e.printStackTrace();}
		}
		super.handleMessageFromServer(msg);
	}
}
