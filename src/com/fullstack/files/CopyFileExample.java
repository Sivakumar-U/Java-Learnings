package com.fullstack.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileExample {

	public static void main(String[] args) {

		FileReader input = null;

		FileWriter output = null;

		try {
			input = new FileReader("C:\\\\Users\\\\usiva\\\\OneDrive\\\\Desktop\\\\Java\\\\Helloworld.java");
			output = new FileWriter("C:\\\\Users\\\\usiva\\\\OneDrive\\\\Desktop\\\\Java\\\\HelloWorldCopy1.java");

			int c = input.read();
			while (c != -1) {
				output.write(c);
				c = input.read();

			}
			input.close();
			output.close();
			System.out.println("File has been copied");

		} catch (IOException e) {
			System.out.println("Exception occured during copying the file");
			e.printStackTrace();
		}

	}

}
