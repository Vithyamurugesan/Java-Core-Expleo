package loopingstatement;

public class WhileStatement {
	public static void main(String[] args) {
		int maxseatcount=10,seatcount=0;
		while(seatcount<maxseatcount) {
			System.out.println("Current Seat Availability "+(maxseatcount));
			seatcount++;
		}
		System.out.println("Seats are filled");	
	}
}
