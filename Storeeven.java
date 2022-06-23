import java.io.*;
class Storeeven
{
	public static void main(String args[])
	{
		RandomAccessFile e;
		try{
		e=new RandomAccessFile("randfile.txt","rw");
		if(args.length > 0)
		{
		for(int i=0;i<args.length;i++)
		{
			if(Integer.parseInt(args[i])%2==0)
				e.writeInt(Integer.parseInt(args[i]));
		}
		   e.seek(0);
		   for(int i=0;i<args.length;i++)
			System.out.println(e.readInt());
			
		e.close();
		}
		/*e.writeInt(45);
		e.writeChar('a');
		e.writeDouble(20.5);
		e.seek(0);
		System.out.println(e.readInt());
        System.out.println(e.readChar());	
        System.out.println(e.readDouble());		*/
		}
		catch(IOException ioe)
		{
			System.out.println(ioe.getMessage());
		}

	}
}
	