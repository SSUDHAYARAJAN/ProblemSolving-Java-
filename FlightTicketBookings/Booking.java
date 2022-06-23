class Booking
{
	Ticket ticket;
	Passenger passenger;
	Flight flight;
	int BookingId;
	static int tempid;
	Booking(Passenger p,Flight f)
	{
		this.passenger=p;
		this.flight=f;
		this.BookingId=++tempid;
	}
	void bookTicket()
	{
		Ticket t=new Ticket(flight,passenger);
		t.showTicket();
		this.ticket=t;
	}
}