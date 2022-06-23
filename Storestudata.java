import java.io.*;
import java.util.Scanner;
public class Storestudata
{
	public static void main(String args[])
	{
		try
		{
		    String name="";
		   FileOutputStream fout=new FileOutputStream("class1.txt");
		   FileInputStream fin=new FileInputStream("class1.txt");

		   File f=new File("class2.txt");
		   /*byte b[]=name[0].getBytes();
		   byte c[]=name[1].getBytes();
		   fout.write(b);
		   fout.write(c);
		   int ch;
		   
		   while((ch=fin.read())!=-1)
		   {  
		     System.out.println((char)ch);
		   }
           System.out.println(f.canWrite());*/
		   Scanner s=new Scanner(System.in);
		   System.out.println("enter your name");
		   name+=s.nextLine();
		   fout.write(name.getBytes());
		   System.out.println("enter your reg.no");
		   name=s.nextLine();
		   fout.write(name.getBytes());
		   fout.close();
		   fin.close();
		   
		   
		   
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
		
		
	