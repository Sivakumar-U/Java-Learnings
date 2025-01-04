package com.java.collections.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BoxOffice {

	public static void main(String[] args) {

		List<Movie> movies = new ArrayList<Movie>();

		movies.add(new Movie("Kalki", 9, 1000, MovieCategory.SCIFI));
		movies.add(new Movie("GunturKaram", 8, 3000, MovieCategory.COMEDY));
		movies.add(new Movie("Salaar", 7, 2000, MovieCategory.THRILLER));
		movies.add(new Movie("Legend", 8, 1500, MovieCategory.COMEDY));
		movies.add(new Movie("Pushpa", 7, 2500, MovieCategory.HORROR));
		movies.add(new Movie("Devara", 6, 500, MovieCategory.THRILLER));

		Map<MovieCategory, List<Movie>> groupBycategory = movies.stream()
				.collect(Collectors.groupingBy(Movie::getCategory));
		System.out.println(groupBycategory);

		// using forEach
		for (MovieCategory category : groupBycategory.keySet()) {
			System.out.println("category ==== " + category);

			for (Movie movie : groupBycategory.get(category)) {
				System.out.println("=====> Movie == " + movie.getName());
			}
		}
	}

}
