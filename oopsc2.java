package Pack1;
import java.util.*;

/*class clate{
	public void Area(double num1, String data) {
		
		System.out.println("Area of Rectangle:"+num1);	
		System.out.println("The given Data:"+data);
	}
	public void Area(String data, double num1) {
		System.out.println("The given Data:"+data);
		System.out.println("Area of Rectangle:"+num1);
	}
	
}

public class Tem{
	public static void main(String[] args) {
		clate c=new clate();
		c.Area("Cricket",5);
		c.Area(5,"Cricket");
		
	}
}
*/
/*
class Student{
	public int sno;
	public String sname;
	public float mark;
	public Student()//default constructor
	{
		this.sno=101;
		this.sname="Vivek";
		this.mark=89.4f;//this.-->specifies current variable 
		
	}
	public void display() {
		System.out.println("Student No:"+sno);
		System.out.println("Student Name:"+sname);
		System.out.println("Student Mark:"+mark);
	}
}

public class Tem{
	public static void main(String[] args) {
		Student s1=new Student();//constructor will be invoke automatically
	}
}
*/



class Square
{
	protected int num;
	public void Area1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Side of Square:");
		num=sc.nextInt();
		int area=num*num;
		System.out.println("Area of Aquare="+area);
	}
	
}
class Circle extends Square
{
	public void Area2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rdius of Circle:");
		num=sc.nextInt();
		double area=3.14*num*num;
		System.out.println("Area of Circle="+area);
		
	}
}
class Rect extends Circle{
	public void Area3() {
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		int area=num*num-1;
		System.out.println("Area of rectangle"+ area);
	}
}
public class Tem {
	public static void main(String[] args) {
		Circle c=new Circle();
		c.Area1();
		c.Area2();
		c.Area3();
		
	}
}
