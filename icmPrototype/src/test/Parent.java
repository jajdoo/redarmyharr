package test;

import java.io.Serializable;
import java.util.ArrayList;

public class Parent implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = -2781769542950265539L;
	public ArrayList<Child> children = new ArrayList<Child>();
}
