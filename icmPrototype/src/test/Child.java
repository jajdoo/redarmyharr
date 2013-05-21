package test;

import java.io.Serializable;

public class Child implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8751528529693917810L;
	public Parent parent;
	public int id;
	
	public Child(int id, Parent parent)
	{
		this.parent = parent;
		this.id = id;
		parent.children.add(this);
	}
}
