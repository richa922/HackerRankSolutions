import java.util.*;
import java.lang.*;
import java.io.*;

class positionOfFirstSetBit 
{
	public static void main (String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n=sc.nextInt();
			n=(int)(Math.log(n&-n)/Math.log(2));
			n++;
			System.out.println(n);
			t--;
		}
	}
}