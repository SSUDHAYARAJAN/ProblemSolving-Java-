import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class xor {

    /*
     * Complete the 'sumXor' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts LONG_INTEGER n as parameter.
     */
    public static long xor(long n,long k)
    {
        long s=0,r1,r2,a=0,sum=0;
        if (n==0)
            return k;
        else if(k==0)
            return n;
        while(n>0 || k>0)
        {
            r1=n%2;
            r2=k%2;
            
            if(r1!=r2)
            {
                s+=1*(long)Math.pow(10,a);
                a++;
            }
            else
            {
                a++;
            }
            n/=2;
            k/=2;
        }
        /*String temp=String.valueOf(s);
        return Long.parseLong(temp, 2);*/

       a=0;
        while(s>0)
        {
            r1=s%2;
            if(r1==1)
            {
            sum+=r1*(long)Math.pow(2,a);
            }
            s/=10;
            a++;
        }
        return sum;
    }
    
    public static void main(String ar[]) {
    // Write your code here
    long count=0,n=776;
    if (n==0)
        return 1;
    for(long i=0;i<n;i++)
    {
        if((n+i)==xor(n,i))
            count++;
    }
    System.out.println(count);
    
    }

}