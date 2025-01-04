package com.fullstack.files;

import java.io.File;

public class FileExistsExample {

	public static void main(String[] args) {

		String fileName = "example.txt";

		File file = new File(fileName);

		boolean check = file.exists();

		System.out.println("File with " + fileName + " " + (check ? "exists" : "does not exist"));
	}

}
