package com.fullstack.files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {

	public static void main(String[] args) {

		String fileName = "example.txt";

		File file = new File(fileName);

		try {
			// Initializing FileWriter for the file object
			FileWriter writer = new FileWriter(file);

			writer.write("Hello, This is Sivakumar");

			writer.close();

			System.out.println("completed writing into file " + fileName);

		} catch (IOException e) {
			System.out.println("Unable to initialize FileWriter for file " + fileName);
			e.printStackTrace();
		}
	}

}
