class shape{
	int area()
	{
		System.out.println("no area");
		return 0;
	}
}
public class rectangle1 extends shape{
	int breadh,length;
	rectangle1(int l,int b)
	{
		breadh=b;
		length=l;
	}
	int area()
	{
		return breadh*length;
	}
	void area(int i)
	{
		System.out.println("hello rectangle1");
	}
public static void main(String args[])
{
	rectangle1 r=new rectangle1(9,4);
	int a=r.area();
	System.out.println(a);
	shape s=new shape();
	//
	r.area();
	System.out.println(s.area());
    r.area(6);
	
}
}
		
	