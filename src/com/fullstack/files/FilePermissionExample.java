
package com.fullstack.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePermissionExample {

	public static void main(String[] args) {

		String fileName = "readonlyexample.txt";

		File file = new File(fileName);

		FileWriter writer = null;

		try {

			// step 1: Create new file
			boolean success = file.createNewFile();

			// step 2: write the data into the new file which means Read-Only file.
			writer = new FileWriter(file);

			writer.write("Creating a Read-Only file, next time file writer will not be able to access this file");

			// cannot perform write operation which makes it a read-only file using
			// setWritable() method by keeping in false
			file.setWritable(false);

			// close the writer
			writer.close();

			System.out.println("File with name\"" + fileName + "\" " + (success ? "is created" : "already exists"));

			// step 3: Accessing Read-Only file
			FileReader reader = new FileReader(file);

			String output = "";

			int c = reader.read();

			while (c != -1) {
				output += (char) c;
				c = reader.read();
			}

			System.out.println("Reading file, File content: \n" + output);

			reader.close();

			// Step 4: Accessing read-only file second time
			writer = new FileWriter(file);

			writer.write("Again trying to write into the file");

			writer.close();

		} catch (IOException e) {
			System.out.println("Unable to create file " + fileName);
		}
	}

}
