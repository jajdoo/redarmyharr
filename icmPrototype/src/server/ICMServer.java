package server;

import java.io.IOException;

import org.orm.PersistentException;

import hibernate.Class2;
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
		System.out.println("server got message!");
		try 
		{
			Class2 c = Class2.getClass2ByORMID(1);
			client.sendToClient(c);
		} 
		catch (PersistentException e) {e.printStackTrace();} 
		catch (IOException e) {e.printStackTrace();}
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
