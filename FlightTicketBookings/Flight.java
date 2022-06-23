import java.util.*;
class Flight
{
	int seats;
	String flightname;
	int flightId;
	List<Passenger>passengerslist;
	Flight(int flightId,String flightname)
	{
		this.seats=50;
		this.flightId=flightId;
		this.flightname=flightname;
		passengerslist=new ArrayList<Passenger>();
	}
	void addPassenger(Passenger p)
	{
		passengerslist.add(p);
	}
	boolean isSeatsAvailable(int n)
	{
		if((seats-n)>0)
		{
			seats=seats-n;
			return true;
		}
		return false;
	}
	void showFlightDetails()
	{
		System.out.println("Flight name     : "+flightname);
		System.out.println("Flight Id       : "+flightId);
		System.out.println("seats Available :"+seats);
		System.out.println("---------------------Passenger detaills--------------------------");
		for(Passenger p:passengerslist)
		{
			System.out.println("passengername: "+p.passengername+" , passengerId: "+p.passengerId);
		}
	}
}