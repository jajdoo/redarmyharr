package client;

import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.PersistentTransaction;

import hibernate.Class1;
import hibernate.Class2;
import hibernate.ProtoPersistentManager;
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
		/*
		Class1 c = (Class1)msg;
		
		System.out.println(c.getId1());
		System.out.println(c.getText());
		*/
		
		Class2 c2 = (Class2)msg;
		Class1 c1 = c2.getParent();
		
		System.out.println(c2.getId2());
		System.out.println(c2.getSomeNum());
		System.out.println("-----------");
		System.out.println(c1.getId1());
		System.out.println(c1.getText());
		
		c1.setText(" OMG OMG OMGOMG ");
		
		try 
		{
			PersistentSession s = ProtoPersistentManager.instance().getSession();
			PersistentTransaction t = s.beginTransaction();
			
			s.save(c1);
			t.commit();
			s.close();
		} 
		catch (PersistentException e) {e.printStackTrace();}
		
		super.handleMessageFromServer(msg);
	}
}
