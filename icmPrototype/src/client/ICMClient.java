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
			Class2 c2 = new Class2();
			Class1 c1 = (Class1)msg;
			c2.setParent(c1);
			c2.setSomeNum(111111);
			c1.setText("ITS A NEW ONE!!!");
			
			try 
			{
				sendToServer(c1);
			}
			catch (IOException e) {e.printStackTrace();}
		}
		super.handleMessageFromServer(msg);
	}
}
