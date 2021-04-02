/*Serializable Interface
Serialization in java can be defined as the process of converting the state of an object into a byte stream. 
This can be achieved by using the serializable interface which is present in java.io.package. 
It must be noted that the all subtypes of a serializable class are themselves serializable.
*/

package com.string;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

 class Main implements Serializable
{
int j;
transient String s;
// A class constructor
	public Main(int j,String s)
	{
		this.j = j;
		this.s = s;
	}
}

public class MainClass
	{
	public static void main(String[] args) throws IOException, ClassNotFoundException
		{
		Main obj = new Main(25,"HelloWorld");
		// Serializing 'obj'
		FileOutputStream fos = new FileOutputStream("pqr.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);
		// De-serializing 'obj'
		FileInputStream fis = new FileInputStream("pqr.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Main b = (Main)ois.readObject(); //down-casting object
		System.out.println(b.j+" "+b.s);
		// closing streams
		oos.close();
		ois.close();
		}
}
