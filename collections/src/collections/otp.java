package collections;

import java.util.ArrayList;
import java.util.Random;

public class otp {
public static void main(String[]args){
	ArrayList<Integer> al=new ArrayList<Integer>();
	Random r=new Random();
	for(int i=1;i<=5;i++)
	{
		al.add(new Integer(r.nextInt(100)));
		
	}
	System.out.println("elements are");
	for(int i:al)
	{
		System.out.println(i);
	}
}
}
