import java.io.*;
import java.util.*;
import java.util.ArrayList;

class Node
{
	int data;
	Node left,right;

	Node(int d)
	{
		this.data=d;
		this.left=null;
		this.right=null;
	}
}
class Tree
{

	//public static ArrayList<Integer> arr=new ArrayList<Integer>();
	Node root;
	Tree()
	{
		this.root=null;
	}

	public void display(Node curr)
	{
		if(curr==null)
			return;
		
		display(curr.left);
		System.out.print(" "+curr.data);
		display(curr.right);
	}

	public void add(int d)
	{
		Node n=new Node(d);
		if(root==null)
		{
			root=n;
		}
		else
		{
			Node curr=root;
			Node parent=null;

			while(true)
			{
				parent=curr;
				if(d<curr.data)
				{
					curr=curr.left;
					if(curr==null)
					{
						parent.left=n;
						return;
					}

				}
				else
				{
					curr=curr.right;
					if(curr==null)
					{
						parent.right=n;
						return;
					}
				}
			}

		}
	}
	public boolean containsNode(int a,int[] arr)
	{

		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==a)
			{
				System.out.println("found"+a+" !!" );
				return true;
			}
		}
		return false;
	}

	public int[] getList(Node curr,int[] arr,int pos)
	{
		if(curr==null)
			return arr;
		
		getList(curr.left,arr,pos);
		arr[pos]=curr.data;
		pos++;
		getList(curr.right,arr,pos);
		return arr;
	}

	public void common(Node t2root,int[] arr)
	{
		if(t2root==null)
			return;
		common(t2root.left,arr);
		System.out.println("comapring : "+ t2root.data);
		if(containsNode(t2root.data,arr))
			{
				System.out.print(t2root.data+" ");
			}
		common(t2root.right,arr);
	}

	public void findCommon(Node t1root, Node t2root)
	{
		int len=0;
		len=findLength(t1root,len);
		int[] arr=new int[len];
		arr=getList(t1root,arr,0);
		for(int i=0;i<len;i++)
			System.out.print(arr[i]+" ");
		//System.out.println(arr);
		common(t2root,arr);
	}

	public int findLength(Node head,int len)
	{
		if(head==null)
			return len;
		len++;
		len=findLength(head.left,len);
		len=findLength(head.right,len);
		System.out.println(" array length: "+ len);
		return len;
	}
}
public class printCommonNodesInBst
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t!=0)
		{
			int n1=sc.nextInt();
			Tree t1=new Tree();
			for(int i=0;i<n1;i++)
				t1.add(sc.nextInt());

			int n2=sc.nextInt();
			Tree t2=new Tree();
			for(int i=0;i<n2;i++)
				t2.add(sc.nextInt());
			t1.findCommon(t1.root, t2.root);

			t--;
		}
	}
}


			/*Tree t1=new Tree();
			t1.add(5);
			t1.add(1);
			t1.add(0);
			t1.add(4);
			t1.add(10);
			t1.add(7);
			t1.add(9);
			t1.display(t1.root);
			System.out.println();
			Tree t2=new Tree();
			t2.add(10);
			t2.add(7);
			t2.add(4);
			t2.add(9);
			t2.add(20);
			t2.display(t2.root);
			System.out.println();*
			t1.findCommon(t1.root, t2.root);*/