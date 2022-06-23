import java.util.*;
class Ticket
{
	int ticketid;
	int ticketprice;
	static int temprice=5000;
	static int tempid;
	Flight flight;
	Passenger passenger;
	Ticket(Flight flight,Passenger passenger)
	{
		ticketid=++tempid;
		ticketprice=temprice;
		temprice+=200;
		this.flight=flight;
		this.passenger=passenger;
		System.out.println("your ticket Id is : "+ticketid);
	}
	void showTicket()
	{
		System.out.println("passenger name :"+passenger.passengername);
		System.out.println("passenger Id   :"+passenger.passengerId);
		System.out.println("Flight Name: "+flight.flightname+"  "+"Flight Id: "+flight.flightId);
		System.out.println("Ticket Id: "+ticketid+" "+"Ticket Price: "+ ticketprice);
	}
}