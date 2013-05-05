package apps;
import java.io.IOException;
import client.ICMClient;


public class ClientApp 
{
	public static void main(String[] args) 
	{
		
		ICMClient client = new ICMClient(args[0], Integer.parseInt(args[1]));
		
		try 
		{
			client.openConnection();
			client.sendToServer("greetings!");
		} 
		catch (IOException e) {e.printStackTrace();}
	}

}
