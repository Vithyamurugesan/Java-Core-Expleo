package function;

public class MovieFunctionDeclare {
		static void getMovieDetails(String moviename,String moviedescription,int movieduration,
				String movielanguage,String moviereleasedate,String moviecountry,String moviegenre) {
			System.out.println("Movie Name : "+moviename);
			System.out.println("Movie Description : "+moviedescription);
			System.out.println("Movie Duration : "+movieduration);
			System.out.println("Movie Language : "+movielanguage);
			System.out.println("Movie Release Date : "+moviereleasedate);
			System.out.println("Movie Country: "+moviecountry);
			System.out.println("Movie Movie Genre : "+moviegenre);
	}
	public static void main(String[]args) {
		String moviename="AAA";
		String moviedescription="Drama045";
		int movieduration=3;
		String movielanguage="Tamil";
		String moviereleasedate="17/02/2026";
		String moviecountry="XYZ";
		String moviegenre="Thriller";
		System.out.println("___Movie Details____");
		getMovieDetails(moviename, moviedescription, movieduration, movielanguage, moviereleasedate, moviecountry, moviegenre);
		System.out.println("__________________");
	}

}
