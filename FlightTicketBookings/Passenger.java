class Passenger
{
	String passengername;
	int passengerId;
	Ticket passengerticket;
	Flight passengerflight;
	static int tempid;
	Passenger(String passengername,Flight f)
	{
		this.passengername=passengername;
		this.passengerId=++tempid;
		this.passengerflight=f;
	}
}