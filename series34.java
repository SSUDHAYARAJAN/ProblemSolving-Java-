import java.util.*;
class series34{
public static String rev(String str)
{
	StringBuilder sb=new StringBuilder(str);
	sb.reverse();
	return sb.toString();	
}
public static void main(String args[])
{
	int n,start,i,a=1,b=2,counter=1,digitcount=1,dif,reminder,n2,op;
	String s="";
	Scanner sc=new Scanner(System.in);
	//consider 3,4 as 0,1 which means binary series
	System.out.println("series:   3,4,33,34,43,44,333,334,343,344,433,434,443,444,3333,.....");
	System.out.println("enter n to find the nth term of the given series ");
	n=sc.nextInt();
	//this series based on the number of digits
	//track the number of digits 
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
	dif=n-counter;
	n2=dif;
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
	op=Integer.parseInt(s);

	System.out.println("n="+n+" digitcount="+digitcount+" , "+"counter"+counter+" , "+"diffecrence="+dif+"  ");
	//System.out.println("string is"+op);
	if(digitcount-s.length()==0)
	{
		System.out.println(n+"th number of the series is : "+op);
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
		System.out.println(n+"th number of the series is : "+finalsum);
	}
}
}