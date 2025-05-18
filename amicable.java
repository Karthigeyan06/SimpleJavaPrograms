package Pack1;
import java.util.*;

public class Exa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number 1:");
		int n=sc.nextInt();
		System.out.println("Enter Number 2:");
		int m=sc.nextInt();
		int sum1=0;
		int sum2=0;
		for (int i=1;i<n;i++) {
			if (n%i==0) {
				sum1+=i;
			}
		}
		for (int j=1; j<m; j++) {
			if(m%j==0) {
				sum2+=j;
			}
		}
		if ((sum1==m) && (sum2==n)){
			System.out.println("The numbers "+n+" and "+m+" are Amicable");
		}
		else {
			System.out.println("The numbers "+n+" and "+m+" are not Amicable");
		}
		int sum=0;
		int val=0;
		
		if (sum==val) {
			System.out.println("Sum of all digits="+sum);		
		}
		else {
			System.out.println("Not Armstrong number");
		}
		
		

	}

}
