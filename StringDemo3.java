//import java.util.*;
public class Stringsort
{
 public static void main(String args[])
 {
	 String temp;
	 for(int i=0;i<args.length;i++)
	 {
		 for (int j=i+1;j<args.length;j++)
		 {
			 if(args[i].compareTo(args[j])>0)
			 {
				  temp=args[i];
				  args[i]=args[j];
				  args[j]=temp;
			 }
		 }
	 }
	 for(int i=0;i<args.length;i++)
	 {
		 System.out.println(args[i]);
		// System.out.print(args[i].length());
	 }
	 Scanner s=new Scanner(System.in);
	 System.out.println("enter number as int ");
	 int a=s.nextInt();
	 System.out.println("a="+a);
	 // Demonstrate String arrays.
