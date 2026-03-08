package movieexample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class movie {
	public static void main(String[]args) throws ParseException{ 
		Scanner console=new Scanner(System.in);
		
		System.out.println("Enter Movie ID");
		int movieid=console.nextInt();
		console.nextLine();
		
		System.out.println("Enter Movie Name");
		String moviename=console.nextLine();
		
		System.out.println("Enter Movie Description");
		String description=console.nextLine();
		
		System.out.println("Enter movie Genre");
		String genre=console.nextLine();
		
		System.out.println("Enter the release date(dd/MM/yyyy):");
		String date=console.next();
		SimpleDateFormat releasedate=new SimpleDateFormat("dd/MM/yyyy");// Month format should be MM
		Date moviedate=releasedate.parse(date);
		
		System.out.println("Enter movie seat cost:");
		int seatcost=console.nextInt();
		
		System.out.println("ENTER MOVIE DETAILS ARE");
		System.out.println("Movie ID " +movieid);
		System.out.println("Movie Name " +moviename);
		System.out.println("Movie Description " +description);
		System.out.println("Movie Genre " +genre);
		System.out.println("Movie Release Date " +moviedate);
		System.out.println("Movie seat cost " +seatcost);
		console.close();
	}


}
