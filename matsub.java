import matrix.*;
import java.util.Scanner;
public class matsub
{
	public static void main(String args[])
	{
		System.out.println("enter order of square matrix for sub");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		Matrix matrix1=new Matrix(n,n);
		Matrix matrix2=new Matrix(n,n);
        Matrix matrix3=new Matrix(n,n);
		matrix1.read();
		matrix2.read();
		System.out.println("value after subtract two matrix");
		matrix3=matrix3.sub(matrix1,matrix2);
		matrix3.display();
		matrix3=null;
		matrix2=null;
		matrix1=null;
	}
}
