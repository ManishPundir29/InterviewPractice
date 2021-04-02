package com.string;

//Java code to explain effect of
//Serilization on singleton classes
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*Serialization:- Serialization can also cause breakage of singleton property of singleton classes.
Serialization is used to convert an object of byte stream and save in a file or send over a network. 
Suppose you serialize an object of a singleton class. 
Then if you de-serialize that object it will create a new instance and hence break the singleton pattern.*/

public class SerializationGFG
{

	public static void main(String[] args)
	{
		try
		{
			Singleton instance1 = Singleton.instance;
			ObjectOutput out
				= new ObjectOutputStream(new FileOutputStream("file.text"));
			out.writeObject(instance1);
			out.close();
	
			// deserailize from file to object
			ObjectInput in
				= new ObjectInputStream(new FileInputStream("file.text"));
			
			Singleton instance2 = (Singleton) in.readObject();
			in.close();
	
			System.out.println("instance1 hashCode:- "
												+ instance1.hashCode());
			System.out.println("instance2 hashCode:- "
												+ instance2.hashCode());
		}
		
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}


/*
 * As you can see, hashCode of both instances is different, hence there are 2
 * objects of a singleton class. Thus, the class is no more singleton.
 * 
 * Overcome serialization issue:- To overcome this issue, we have to implement
 * method readResolve() method
 */