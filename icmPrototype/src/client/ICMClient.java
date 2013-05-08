package client;

import java.io.IOException;

import hibernate.Class1;
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
		if( msg instanceof Class1 )
		{
			Class1 c1 = (Class1)msg;
			
			setChanged();
			notifyObservers("server sent Class1 object: \n"+c1.getId1()+"\n"+c1.getText());
			
			c1 = Class1.createClass1();
			c1.setText("THIS IS CLIENT OBJECT!");
			
			try 
			{
				System.out.println("client sending Class1 instance to server..");
				sendToServer(c1);
			}
			catch (IOException e) {e.printStackTrace();}
		}
	}
}
