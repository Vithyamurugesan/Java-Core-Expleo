package controlflowstatementlevel2;

public class SecondsInAWeek {
	    public static void main(String[] args) {
	        int secondsperday = 86400;
	        int daysinweek = 7;
	        int totalseconds = 0;
	        if (daysinweek == 7) {
	            totalseconds = secondsperday * daysinweek;
	            System.out.println("Total seconds in a week: " + totalseconds);
	        }
	    }
}


