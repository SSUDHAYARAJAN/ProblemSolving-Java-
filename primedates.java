import java.io.*;
import java.util.*;

public class primedates {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner s=new Scanner(System.in);
    int i,j,sum1=0,sum2=0,a=7,b=7;
	String u,v;
    //u=s.nextLine();
    //v=s.nextLine();
	u="01-11-2001";
	v="14.09.2020";
    for(i=0;i<u.length();i++)
    {
        if(u.charAt(i)!='-' && u.charAt(i)!='.' && u.charAt(i)!='/' )
		{
            sum1+=((int)u.charAt(i)-48)*((int)Math.pow(10,a));
			a--;
		}
        if(v.charAt(i)!='-' &&  v.charAt(i)!='.' && v.charAt(i)!='/' )
		{
            sum2=sum2+((int)v.charAt(i)-48)*((int)Math.pow(10,b));
			b--;
		}
	
    }
    System.out.println(sum1);
    System.out.println(sum2);
    }
}