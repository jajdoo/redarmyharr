package client;

import ocsf.client.ObservableClient;
import test.Child;
import test.Parent;

public class ICMClient extends ObservableClient
{
	public ICMClient(String host, int port) 
	{
		super(host, port);
	}

	@Override
	protected void handleMessageFromServer(Object msg) 
	{
		Parent parent = (Parent) msg;
		
		for( Child child : parent.children )
		{
			notifyObservers("child: "+child.id);
			setChanged();
		}
	}
}
