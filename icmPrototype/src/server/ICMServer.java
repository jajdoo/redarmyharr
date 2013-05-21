package server;

import java.io.IOException;

import org.apache.commons.collections.functors.PrototypeFactory;
import org.hibernate.Hibernate;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import hibernate.Class1;
import hibernate.ProtoPersistentManager;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;
import ocsf.server.ObservableServer;
import test.Child;
import test.Parent;

public class ICMServer extends ObservableServer
{
	// Constructors
	//-------------------------------------------------------------------------
	/**
	 * 
	 * @param port
	 */
	public ICMServer(int port) 
	{
		super(port);
	}
	
	// overrides
	//-------------------------------------------------------------------------
	/**
	 * 
	 */
	@Override
	protected void handleMessageFromClient(Object msg, ConnectionToClient client) 
	{
		Parent parent = new Parent();
		for( int i=0 ; i<10 ; i++ )
		{
			Child child = new Child(i, parent);
		}
		
		try {
			client.sendToClient(parent);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method overrides the one in the superclass.  Called
	 * when the server starts listening for connections.
	 */
	protected void serverStarted()
	{
		setChanged();
		notifyObservers("Server listening for connections on port " + getPort());
	}
	
	/**
	 * This method overrides the one in the superclass.  Called
	 * when the server stops listening for connections.
	 */
	protected void serverStopped()
	{
		setChanged();
		notifyObservers("Server has stopped listening for connections.");
	}
}
