package Pack1;
import java.util.*;

public class Pract {
	/*public static int product(int arr) {
		if (y==1) {
			return x;
		}
		else {
			return x+product(x,y-1);
		}
	}
*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*ODD AND EVEN USING CONTINUE
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			if(i%2!=0) {
				continue;
			}
			else {
				System.out.println(i+" ");
			}
			
		}*/
		
		/* VOWELS IN STRING
		String name=sc.nextLine();
		String vowels="aeiouAEIOU";
		int count=0;
		for(int i=0; i<name.length();i++) {
			char ch=name.charAt(i);
			if(vowels.indexOf(ch)!=-1) {
				count++;
				
			}
		}
		System.out.println(count);*/
		
		/* FIZZFUZZ
		int number=sc.nextInt();
		for (int num=1;num<number+1;num++) {
		if((num%3==0) && (num%5==0)) {
			System.out.println("FizzFuzz");
		}
		else {
			if (num%3==0) {
				System.out.println("Fizz");
			}
			else {
				if(num%5==0) {
				System.out.println("Fuzz");
				}
				else {
					System.out.println(num);
				}
			}
		}
		}*/
		/*NUMBER PATTERN
		int num=1;
		int n=sc.nextInt();
		for(int i=1;i<n+1;i++) {
			for(int j=1;j<i+1;j++) {
				System.out.print(num);
				num++;
			}
			System.out.println();
		}*/
		/*
		int arr[]=new int[100];
		System.out.println("Enter array size:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter the number for index "+i+":");
			arr[i]=sc.nextInt();
			
		}*/
		/* MIN AND MAX
		int lo=arr[0];
		int hi=arr[0];
		for (int i=0;i<n;i++) {
			if(arr[i]<lo) {
				lo=arr[i];
			}
		}
		for (int i=0;i<n;i++) {
			if(arr[i]>hi) {
				hi=arr[i];
			}
		}
		
		System.out.println("Greatest Number:"+hi+" Lowest Number:"+lo);
		
		for (int j=0;j<n;j++) {
			
		for(int i=j+1;i<n;i++) {
			if(arr[j]>arr[i]) {
				int m=arr[i];
				arr[i]=arr[j];
				arr[j]=m;
						
			}
		}
		}
		for(int i=0;i<n;i++) {
			
			System.out.print(arr[i]+" ");
		}
		*/
		
		/*String in array
		String arr[]=new String[100];
		System.out.println("Enter the array size:");
		int n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter the "+i+":");
			String element=sc.next();
			arr[i]=element;	
		}
		System.out.println("The given array elements are");
		for (int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}*/
		/*int n=3;
		int sum=0;
		int arr[][]=new int[100][100];
		for (int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				int v=sc.nextInt();
				
				arr[i][j]=v;
				sum+=v;
			}
			System.out.println();
		}
		System.out.println(sum);
		*/
		/*
		int arr[]= {1,9,5,6,8,2};
		int ari[]=new int[100];
		int max=arr[arr.length-1];
		ari[0]=max;
		for(int i=arr.length-2;i<0;i--) {
			if(max<arr[i]) {
				System.out.println(arr[i]);
				max=arr[i];
				
			}
		}
		*/
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int n=arr.length;
		/*
		for (int i=0;i<n;i++) {
			System.out.print(arr[i][i]+" ");
		}
		System.out.println();
		
		for (int i=0;i<n;i++) {
			System.out.print(arr[i][n-i-1]+" ");
		}
		System.out.println();
		int sum=0;
		for (int i=0;i<n;i++) {
			for (int j=0; j<n;j++) {
				sum+=arr[i][j];
			}
			System.out.println(sum);
			sum=0;
		}
		*/
		int n=0
		
		
			
		
	}

}
