package collections;

import java.util.ArrayList;

public class al1 {

	public static void main(String[]args)
	{
		ArrayList al= new ArrayList ();
		for(int i=0;i<=50;i+=10)
		{
			al.add(new Integer(i));
			
		}
		System.out.println(al);
	
		al.add(3,100);
		System.out.println(al.size());
		System.out.println("al elements="+al);
		ArrayList al2=(ArrayList)al.clone();
		System.out.println("al2 cloned elements="+al2 );
		al.addAll(4,al2);
		System.out.println(al);
	}
}
