package arith;
public class operation
{
	double a,b;
	public double sum(int a,int b)
	{       this.a=a;
                this.b=b;
		return ((this.a)+(this.b));
	}
	public double mul(int a,int b)
	{       this.a=a;
                this.b=b;
		return (this.a*this.b);
	}
	public double div(int a,int b)
	{
                this.a=a;
                this.b=b;
		return (this.a/this.b);
	}
	public double sub(int a,int b)
	{       
                 this.a=a;
                this.b=b;
		return (this.a-this.b);
	}
}