class age{
	int a,b;
}
class vote{
	public static void main(String args[]){
		age v=new age();
		v.a=25;
		v.b=14;
		if(v.a>=18){
			System.out.println("age "+v.a+" is eligible for vote ");
		}
		else{
			System.out.println("age "+v.a+" is not eligible for vote ");
		}
		if(v.b>=18){
			System.out.println("age "+v.b+" is eligible for vote ");
		}
		else{
			System.out.println("age "+v.b+" is not eligible for vote ");
		}
	}
}
		
	
