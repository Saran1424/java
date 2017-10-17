package collections;

import java.util.ArrayList;

public class Removrrange {
	
public static void main(String[]args)
{
	int i=0;
	ArrayList al=new ArrayList();
	for(i=0;i<=100;i++)
	{
		al.add(new Integer(i));
		i++;
			}
	System.out.println(al);
al.removeRange(4,8);

}
}
