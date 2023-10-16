package Javaprectice;

public class Student {
String name;
int sid;
int rollno;
int std;
public Student(String name,int sid,int rollno,int std) 
{
	this.name=name;
	this.sid=sid;
	this.rollno=rollno;
	this.std=std;
}
public void DisplayDetails() 
{
	System.out.println("name="+name);
	System.out.println("sid="+sid);
	System.out.println("rollno="+rollno);
	System.out.println("std="+std);
	System.out.println("-----------------------------------------------");
}
public static void main(String[] args) 
{
	Student s=new Student("Dinesh",123,01,10);
	Student s1=new Student("Dashrath",321,02,11);
	Student s2=new Student("Abijeet",231,03,12);
	s.DisplayDetails();
	s1.DisplayDetails();
	s2.DisplayDetails();
}
}
