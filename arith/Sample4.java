//import arith.*;
class rev
{
	int a[];
	rev()
	{
		a=new int[10];
	}
	void printarray(int i)
	{
		if(i==9)
		return;
	    else
			printarray(i+1);
		System.out.println((i+1)+"and"+a[i+1]);
	}
	
	
}
class fibbo
{
	int fib(int n)
	{
		if(n==0 )
			return 0;
		else if(n==1)
			return 1;
		else
			return (fib(n-1)+fib(n-2));
	}
}
	
class str
{
	String s="udhayarajan",s2="udhayarajan";
    void show()
	{
		System.out.println(s.substring(0,5));
		System.out.println(s.charAt(3));
		System.out.println(s.length());
		System.out.println(s.equals(s2));
	}
}

public class Sample4
{
public static void main(String args[])
	{
		/*rev o=new rev();
		for(int i=0;i<10;i++)
			o.a[i]=i;
		o.printarray(0);*/
		/*fibbo f=new fibbo();
		for(int i=0;i<5;i++)
			System.out.println(f.fib(i));*/
		str t=new str();
		t.show();
		operation op=new operation();
		op.sum(5,9);
		
	}
}