package Pack1;
import java.util.*;
public class Fibb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long start = System.currentTimeMillis();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the series range:");
		int n=sc.nextInt();
		int f1=-1;
		int f2=1;
		int f3=0;
		for(int i=0;i<n;i++) {
			f3=f1+f2;
			System.out.println(f3+" ");
			f1=f2;
			f2=f3;
			
		}
		int count=0;
		System.out.println("Enter a Number:");
		int num=sc.nextInt();
		for (int i=1;i<num+1;i++) {
			if(num%i==0) {
				count+=1;
			}
		}
		if (count>2) {
			System.out.println("The given number is Not a Prime number");
		}
		else {
			System.out.println("The given number is a Prime number");
		}
		long end = System.currentTimeMillis();
		System.out.println("Execution time: " + (end - start) + " Milliseconds");
	}

}

//your code here

