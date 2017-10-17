package collections;
import java.util.ArrayList;
public class Output {
public static void main(String[]args)
{
	ArrayList al=new ArrayList();
	for(int i=0;i<=100;i+=10)
	{
		al.add(new Integer(i));
	}
	System.out.println(al);
	for(int i=0;i<al.size();i++)
	{
		al.remove(i);
	}
	System.out.println("final list="+al);
}
}
