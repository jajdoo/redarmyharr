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
		System.out.println("---------------------------");
		if( msg instanceof String )
		{
			System.out.println("client sent: "+msg);
			
			try 
			{
				PersistentSession s = ProtoPersistentManager.instance().getSession();
				Class1 c1 = Class1.getClass1ByORMID(s,1);
				s.close();
				client.sendToClient(c1);
				setChanged();
				notifyObservers("sent a Class1 object to client!");
			} 
			catch (PersistentException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}
		}
		else if( msg instanceof Class1 )
		{
			Class1 c1 = (Class1)msg;
			
			
			setChanged();
			notifyObservers("client sent a Class1 object: \n"+c1.getId1()+"\n"+c1.getText());
			
			try 
			{
				PersistentSession s = ProtoPersistentManager.instance().getSession();
				
				PersistentTransaction t = s.beginTransaction();
				s.save(msg);
				t.commit();
				s.close();
				
			} 
			catch (PersistentException e) {e.printStackTrace();}
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
