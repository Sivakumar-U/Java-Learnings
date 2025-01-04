package com.java.collections;

public class Movie {

	private String name;
	private String language;
	private String category;

	public Movie(String name, String language, String category) {
		super();
		this.name = name;
		this.language = language;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", language=" + language + ", category=" + category + "]";
	}

}
