package staticmembers;
//Static members:Static method
public class TheatreScreen {
	private static int totalseats=20;  //static variable
	 public TheatreScreen() {
		System.out.println("Current Seat Availability:"+totalseats);
	}
	 public void DisplayTheatreScreen() {
		 
		 System.out.println("Current Seat Availability:"+totalseats);
	 }
	 public static void BookTicket(int noofTickets) {
		 System.out.println("No. of seats Booked:"+noofTickets);
         totalseats-=noofTickets;	 
	 }
	 public static void main(String[]args) {
		 System.out.println("Screen Ticket Availability Status:");
		 TheatreScreen TS1=new TheatreScreen();
		 TS1.BookTicket(4);
		 TheatreScreen TS2=new TheatreScreen();
		 TS2.BookTicket(5);
		 TS2.DisplayTheatreScreen();	 
	 }
}
