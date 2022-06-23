import java.util.*;
class BookingPortal
{
	public static void main(String args[])
	{
		List <Flight> allflights=new ArrayList<Flight>();
		List <Booking> allbookings=new ArrayList<Booking>();
		List <Passenger> allpassengers=new ArrayList<Passenger>();
		Scanner sc=new Scanner (System.in);
		allflights.add(new Flight(1,"FLIGHT-1"));
		allflights.add(new Flight(2,"FLIGHT-2"));
		allflights.add(new Flight(3,"FLIGHT-3"));
		allflights.add(new Flight(4,"FLIGHT-4"));
		String st="";
		while(true)
		{
			System.out.println("1.BOOK TICKET");
			System.out.println("2.CANCEL TICKET");
			System.out.println("3.FLIGHT DETAILS");
			System.out.println("4.EXIT");
			int choice;
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("enter Flight Id");
				int id=sc.nextInt();
				for(Flight f : allflights)
				{
					if(f.flightId==id)
					{
						System.out.println("how many passengers");
						int p=sc.nextInt();
						if(f.isSeatsAvailable(p))
						{
							for(int i=0;i<p;i++)
							{
								System.out.println("enter passenger details");
								System.out.println("enter passenger name");
								st=sc.nextLine();
								Passenger pasn=new Passenger(st,f);
								f.addPassenger(pasn);
								allpassengers.add(pasn);
								Booking booking=new Booking(pasn,f);
								booking.bookTicket();
								allbookings.add(booking);
							}
						}
						else
						{
							System.out.println("seats not available in "+f.flightname);
						}
					}
				}
			}
			else if(choice==2)
			{
				
			}
			else if(choice==3)
			{
				System.out.println("enter flight Id");
				int id=sc.nextInt();
				boolean flag=false;
				for(Flight f : allflights)
				{
					if(f.flightId==id)
					{
						flag=true;
						f.showFlightDetails();
						break;
					}
				}
				if(flag)
					System.out.println("flight not found");
			}
			else
			{
				break;
			}
			
			
		}
	}
}