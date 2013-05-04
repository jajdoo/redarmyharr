package apps;

import java.io.IOException;

import server.ICMServer;


/**
 * runner for server
 * @author Ni
 *
 */
public class ServerApp 
{
	public static void main(String[] args) 
	{
		ICMServer server = new ICMServer(Integer.parseInt(args[0]));
		try 
		{
			server.listen();
		}
		catch (IOException e) {e.printStackTrace();}
	}

}
