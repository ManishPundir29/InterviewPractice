package com.string;

import java.io.Serializable;

//Singleton class
class Singleton implements Serializable
{
	// public instance initialized when loading the class
	public static Singleton instance = new Singleton();
	
	private Singleton()
	{
		// private constructor
	}
	
	// implement readResolve method
		protected Object readResolve()
		{
			return instance;
		}
}
