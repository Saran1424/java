package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class A
{
	int id;
	String name;
	
	public String toString()
	{
		String rs=id +" and "+name;
		return rs;
	}
	public void m()
	{
		
		System.out.println(id +" and "+name);
	}
}
public class Setclass {
	public static void main(String args[]){
		
		Set set=new HashSet();
		
		 set.add(1);
		 set.add(2);
		 set.add(3);
		 set.add(4);
        	set.add(4);
        	set.remove(2);
		 set.add(5);
		 set.clear();
		 System.out.println(set);
		 set.add(6);
		
		 System.out.println( set.isEmpty());
		 set.add(new A());
		 
		 System.out.println(set);
	A o=new A();
	o.m();
	}

}
