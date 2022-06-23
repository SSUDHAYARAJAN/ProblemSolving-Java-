public class nocw6q1 extends Thread{
	public void run()
	{
		for(int  i=1;i<5;i++)
		System.out.println(i++);
	}
public static void main(String args[])
{
	nocw6q1 o=new nocw6q1();
	o.start();
	try{
		int a=5/10;
	}
	catch(Exception e)
	{
		
	}
	catch(ArithmeticException a)
	{
		
	}
	System.out.println("hello");
			
}
}