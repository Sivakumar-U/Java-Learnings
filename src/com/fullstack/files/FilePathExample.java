package com.fullstack.files;

import java.io.File;

public class FilePathExample {

	public static void main(String[] args) {

		String fileName = "example.txt";

		File file = new File(fileName);

		String check = file.getAbsolutePath();

		System.out.println("Given file loacted at: " + check);
	}

}
