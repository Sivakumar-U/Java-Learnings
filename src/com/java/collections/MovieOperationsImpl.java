package com.java.collections;

import java.util.List;

public class MovieOperationsImpl implements MovieOperations {

	private List<Movie> movies;

	public MovieOperationsImpl(List<Movie> movies) {
		super();
		this.movies = movies;
	}

	@Override
	public int countByCategory(String category) {
		return (int) movies.stream().filter(movie -> movie.getCategory().equalsIgnoreCase(category)).count();
	}

	@Override
	public int countByLanguage(String language) {
		return (int) movies.stream().filter(movie -> movie.getLanguage().equalsIgnoreCase(language)).count();
	}

}
