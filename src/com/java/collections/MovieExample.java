package com.java.collections;

import java.util.ArrayList;
import java.util.List;

public class MovieExample {

	public static void main(String[] args) {

		List<Movie> movieList = new ArrayList<>();

		movieList.add(new Movie("Movie A", "English", "Action"));
		movieList.add(new Movie("Movie B", "Hindi", "Drama"));
		movieList.add(new Movie("Movie C", "Telugu", "Comedy"));
		movieList.add(new Movie("Movie D", "French", "Action"));
		movieList.add(new Movie("Movie E", "English", "Drama"));

		MovieOperations movieOps = new MovieOperationsImpl(movieList);

		// category
		System.out.println("\nBelow are count of movie catagories: ");
		System.out.println("No of Movies in Action :" + movieOps.countByCategory("Action"));
		System.out.println("No of Movies in Drama :" + movieOps.countByCategory("Drama"));
		System.out.println("No of Movies in Comedy :" + movieOps.countByCategory("Comedy"));

		// language
		System.out.println("\nBelow are count of movie languages: ");
		System.out.println("No of Movies in Telugu: " + movieOps.countByLanguage("Telugu"));
		System.out.println("No of Movies in English: " + movieOps.countByLanguage("English"));
		System.out.println("No of Movies in Hindi: " + movieOps.countByLanguage("Hindi"));
		System.out.println("No of Movies in French: " + movieOps.countByLanguage("French"));

	}

}
