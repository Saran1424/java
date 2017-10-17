package collections;

import java.util.ArrayList;

public class Completearraylist {
	public static void main(String args[])
	{
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		
		System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(50);
		al2.add(60);
		al2.add(70);
		al.addAll(al2);
		System.out.println(al);
		al.addAll(2,al2);
		System.out.println(al);
		System.out.println(al.get(2));
		System.out.println(al.size());
		al.add(0,100);
		al.clone();
		
		System.out.println(al);
		al.clear();
		System.out.println(al);
		if(al.isEmpty())
			System.out.println(true);
		else
			System.out.println("false");
		ArrayList<String> al3=new ArrayList<String>();
		al3.add("saran");
		al3.add("saran123");
		for(String obj:al3)
		{
			System.out.println(al3);
		}
		
		
	}
}
