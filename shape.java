class shape{
	int area()
	{
		System.out.println("no area");
		return 0;
	}
}
public class rectangle extends shape{
	int breadh,length;
	rectangle(int l,int b)
	{
		breadh=b;
		length=l;
	}
	int area()
	{
		return breadh*length;
	}
public static void main(String args[])
{
	rectangle r=new rectangle(9,4);
	int a=r.area();
	System.out.println(a);
	shape s=new shape();
	//r.area();
	a=s.area();
}
}
		
	