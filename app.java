import java.util.*;
class customer
{
	String name;
	int phone;
	String address;
	customer(String n,int p,String adr)
	{
		name=n;
		phone=p;
		address=adr;
	}
}
class Item
{
	int itnum;
	int price;
	int stock;
	Item(int a,int b,int c)
	{
		itnum=a;
		price=b;
		stock=c;
	}
}
class Bill
{
	int billno;
	String date;
	customer co;
	int itemnum[]=new int[3];
	int price[]=new int[3];
	int quantity[]=new int[3];
	int value[]=new int[3];
	void addbill(int bn,customer ob,String d,Item it1,Item it2,Item it3,int numofitem)
	{
		billno=bn;
		date=d;
		co=ob;
		k=numofitem;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<k;i++)
		{
			System.out.println("enter item number");
			int in=sc.nextInt();
			if(in==1)
			{
				itemnum[i]=it1.itnum;
				System.out.println("enter quantity of "+it1.itemnum);
				int q=sc.nextInt();
				price[i]=it1.price;
				quantity[i]=q;
				value[i]=itemnum[i]*q;
			}
			if(in==2)
			{
				itemnum[i]=it2.itnum;
				System.out.println("enter quantity of "+it2.itemnum);
				int q=sc.nextInt();
				price[i]=it2.price;
				quantity[i]=q;
				value[i]=itemnum[i]*q;
			}
			if(in==3)
			{
				itemnum[i]=it3.itnum;
				System.out.println("enter quantity of "+it1.itemnum);
				int q=sc.nextInt();
				price[i]=it3.price;
				quantity[i]=q;
				value[i]=itemnum[i]*q;
			}
		}
	}
	void printbill(int k)
	{
		System.out.println("My shop");
		for(int i=0;i<k;i++)
		{
			System.out.print(itnum[i]+"  "+price[i]+" "+quantity[i]+" "+value[i]);
			System.out.println("------------------------------------------------");
			System.out.println();
		}
	}
}
class app
{
	public static void main(String args[])
	{
		Item i1,i2,i3;
		i1=new Item(1,100,10);
		i2=new Item(2,200,20);
		i3=new Item(3,300,30);
		customer c1,c2,c3;
		c1=new customer("cus1","999","xyz");
		c2=new customer("cus2","888","abc");
		c3=new customer("cus3","777","ijk");
		Bill b1=new Bill();
		b1.addbill(1,c1,"01",i1,i2,i3,3);
		b1.printbill(3);
	}
}
	
