class Example{
	int a,b;
	Example returnobj(int i,int j){
		Example obj=new Example();
		obj.a=i;
		obj.b=j;
		return obj;
	}
}
public class Exampledemo{
	public static void main(String args[]){
		
	 Example o1=new Example();
	 Example o2=o1.returnobj(4,5);
	 System.out.println(o2.a+"and"+o2.b);
	}
}