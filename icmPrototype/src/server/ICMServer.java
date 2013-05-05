package server;

import java.io.IOException;

import org.apache.commons.collections.functors.PrototypeFactory;
import org.hibernate.Hibernate;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import hibernate.Class1;
import hibernate.Class2;
import hibernate.ProtoPersistentManager;
import ocsf.server.AbstractServer;
import ocsf.server.ConnectionToClient;

public class ICMServer extends AbstractServer
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
				c1.children.toArray(); //force lazy load
				client.sendToClient(c1);
				s.close();
			} 
			catch (PersistentException e) {e.printStackTrace();} 
			catch (IOException e) {e.printStackTrace();}
		}
		else if( msg instanceof Class1 )
		{
			System.out.println("merging back");
			try 
			{
				PersistentSession s = ProtoPersistentManager.instance().getSession();
				
				PersistentTransaction t =null; //s.beginTransaction();
				t = s.beginTransaction();
				s.update(msg);
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
		System.out.println("Server listening for connections on port " + getPort());
	}
	
	/**
	 * This method overrides the one in the superclass.  Called
	 * when the server stops listening for connections.
	 */
	protected void serverStopped()
	{
		System.out.println("Server has stopped listening for connections.");
	}
}
