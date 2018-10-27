
public class NetflixInstantiation {
	public static void main(String[] args) {
		Movie movie1 = new Movie("Wall-E", 1);
		Movie movie2 = new Movie("Interstellar", 5);
		Movie movie3 = new Movie("Mission Impossible", 4);
		Movie movie4 = new Movie("Avengers", 3);
		Movie movie5 = new Movie("Twilight Zone", 2);

		System.out.println(movie1.getTicketPrice());
		System.out.println(movie2.getTicketPrice());
		System.out.println(movie3.getTicketPrice());
		System.out.println(movie4.getTicketPrice());
		System.out.println(movie5.getTicketPrice());

		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		NetflixQueue netflix = new NetflixQueue();
		netflix.addMovie(movie1);
		netflix.addMovie(movie2);
		netflix.addMovie(movie3);
		netflix.addMovie(movie4);
		netflix.addMovie(movie5);

		netflix.printMovies();

		System.out.println();
		System.out.println("The best movie is " + netflix.getBestMovie());
		System.out.println("The second best movie is " + netflix.getMovie(1));

	}
}
