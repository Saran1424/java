package collections;

import java.util.ArrayList;

class Student
{
int age;
int rank;
String name;
String gender;
 Student(int age,int rank,String name,String gender)
 {
	 this.age=age;
	 this.rank=rank;
	 this.name=name;
	 this.gender=gender;
	 
 }

public class Arraylist {
	public static void main(String[]args)
	{
		Student s1=(14,1,"saran","male");
		Student s2=(140,10,"sai","male");
		Student s3=(145,15,"sunil","male");
		Student s4=(1424,102,"susmitha","female");
		ArrayList al=new ArrayList();
		{
			al.add(s1);
			System.out.println(al);
			
		}
		
	}
}

}
