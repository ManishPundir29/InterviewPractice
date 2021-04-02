package com.string;

//Java code to explain effect of Reflection
//on Singleton property

import java.lang.reflect.Constructor;

//Reflection: Reflection can be caused to destroy singleton property of singleton class, as shown in following example:

public class ReflectionGFG
{

	public static void main(String[] args)
	{
		Singleton instance1 = Singleton.instance;
		Singleton instance2 = null;
		try
		{
			Constructor[] constructors = Singleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors)
			{
				// Below code will destroy the singleton pattern
				constructor.setAccessible(true);
				instance2 = (Singleton) constructor.newInstance();
				break;
			}
		}
	
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	System.out.println("instance1.hashCode():- "
									+ instance1.hashCode());
	System.out.println("instance2.hashCode():- "
									+ instance2.hashCode());
	}
}

/*
 * After running this class, you will see that hashCodes are different that
 * means, 2 objects of same class are created and singleton pattern has been
 * destroyed.
 * 
 * Overcome reflection issue: To overcome issue raised by reflection, enums are 
 * used because java ensures internally that enum value is instantiated only once. 
 * Since java Enums are globally accessible, they can be used for singletons. 
 * Its only drawback is that it is not flexible i.e it does not allow lazy initialization.
 * Java program for Enum type singleton
 *
 * public enum Singleton { INSTANCE; }
 *
 * As enums don’t have any constructor so it is not possible for Reflection to
 * utilize it. Enums have their by-default constructor, we can’t invoke them by
 * ourself. JVM handles the creation and invocation of enum constructors
 * internally. As enums don’t give their constructor definition to the program,
 * it is not possible for us to access them by Reflection also.
 *, reflection can’t break singleton property in case of enums.*/