//object oriented code
import java.util.*;
class Series34
{
int n;
private int i,counter=1,digitcount=1,dif;
private String s="";

private String rev(String str)
{
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	return sb.toString();	
}

private void setdigitcount()
{
	int a=1,b=2;
	for(i=1;i<=Math.sqrt(n);i++)
	{
		if(!(n>=a && n<=b))
		{
			a=a*2+1;
			b=b*2+2;
			counter=counter+(int)Math.pow(2,i);
			digitcount++;
		}
		else
			break;
	}
}

private int trackthenumber()
{
	dif=n-counter;
	int n2=dif;
	//track the number
	if(dif==0)
		s="3";
	else if(dif==1)
		s="4";
	else
	{
	  while(n2!=0)
	  {
		if(n2%2==0)
		  s=s+"3";
		else
         s=s+"4";			
		n2=n2/2;
	  }
	}
	s=rev(s);
	
	return Integer.parseInt(s);
}

int tracktheseries(int number)
{
	n=number;
	if(n<=0)
	{
        System.out.println("invalid entry 0 try as some positive numbers greater than zero");
	}
	//consider 3,4 as 0,1 which means binary series
	//this series based on the number of digits
	
	setdigitcount();//set the digitcount to the number of digits in the nth term
    int	op=trackthenumber();//return what number going to display 

	//below process for convert the tracked number to full form of digit count
	//System.out.println("n="+n+" digitcount="+digitcount+" , "+"counter"+counter+" , "+"diffecrence="+dif+"  ");
	
	if(digitcount-s.length()==0)
	{
		return op;
	}
	else
	{
		//convert as a full form number
		int sum1=0,sum2=0,sum3,finalsum;
		for(i=0;i<digitcount;i++)
		{
			sum1=sum1+3*(int)Math.pow(10,i);
		}
		for(i=0;i<s.length();i++)
		{
			sum2=sum2+3*(int)Math.pow(10,i);
		}
		sum3=sum1-sum2;
		finalsum=sum3+op;
		return finalsum;
	}
}
}
class nth
{
	public static void main(String args[])
	{
		System.out.println("series:   3,4,33,34,43,44,333,334,343,344,433,434,443,444,3333,.....");
		//int x=6;
		Series34 n[]=new Series34[10];
		for(int i=1;i<=n.length;i++)
		{
		n[i-1]=new Series34();
		System.out.println(i+"th number of the series is : "+n[i-1].tracktheseries(i));
		}
	}
}