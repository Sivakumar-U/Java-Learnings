package com.fullstack.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExternalFileReader {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\usiva\\OneDrive\\Desktop\\Java\\Helloworld.java";

		File file = new File(fileName);

		String output = "";

		try {
			// Initializing FileReader for the file object
			FileReader reader = new FileReader(file);

			int c = reader.read();

			// Iteration until EOF(-1)
			while (c != -1) {
				output += (char) c;
				c = reader.read();
			}
			;

			reader.close();

			System.out.println("completed reading from file " + fileName);
			System.out.println("File content: \n" + output);

		} catch (IOException e) {
			System.out.println("Unable to initialize FileReader for file " + fileName);
			e.printStackTrace();
		}

	}

}
