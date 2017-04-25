import java.io.*;
import java.util.*;

public class fibonacci
{
	static int[] arr;
	public static void main(String[] args)
	{
		int n=5;
		arr=new int[n+1];
			
		//memorization : approach to DP 
		int ans=fib(n);
		for(int i=0;i<=n;i++)
			System.out.println(arr[i]);

		//tabularization
		int[] tab=new int[n+1];
		tab[0]=0;
		tab[1]=1;
		for(int i=2;i<=n;i++)
			tab[i]=tab[i-1]+tab[i-2];

		for(int i=0;i<=n;i++)
			System.out.println(tab[i]);

	}

	public static int fib(int n)
	{
		if(n<=1)
			arr[n]=n;
		else
			{
			arr[n]=fib(n-1) + fib(n-2);

			}
		return arr[n];
	}
}