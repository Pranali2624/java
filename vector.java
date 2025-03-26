
import java.lang.*;
import java.util.Enumeration;
import java.util.Vector;

public class vector {
	
	
	public static void mian(String []arg) {
		Vector v = new Vector();
		v.addElement("one");
		v.addElement("two");
		v.addElement("three");
		v.insertElementAt("zero",0);
		v.insertElementAt("oops",3);
		v.insertElementAt("four",5);
		System.out.println("Vector Size:"+v.size());
		System.out.println("Vector capacity"+v.capacity());
		System.out.println("the element of a vector are:");
		Enumeration e=v.elements();
		while(e.hasMoreElements());
		System.out.println(e.nextElement()+"");
		System.out.println();
		System.out.println("the first element is:"+v.firstElement());
		System.out.println("the last element is:"+ v.lastElement());
		System.out.println("teh object element is"+v.indexOf("oops"));
		v.remove("oops");
		v.remove(1);
		System.out.println("After removing 2 elemnts");
		System.out.println("Vector Size :"+v.size());
		System.out.println("the element of vector are:");
		for (int i=0;i <v.size();i++)
		{
			System.out.println(v.elementAt(i)+"");
		}
		
		
		
	}

}
