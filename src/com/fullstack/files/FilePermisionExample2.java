package com.fullstack.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilePermisionExample2 {

	public static void main(String[] args) {

		String fileName = "example3.txt";

		File file = new File(fileName);

		FileWriter writer = null;

		try {

			// step 1: Create new file
			boolean success = file.createNewFile();

			// step 2: write the data into the new file which means Read-Only file.
			writer = new FileWriter(file);

			writer.write(
					"Creating and adding text into a new read-only file , next time file writer will not be able to access this file");

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

			// Step 4: Accessing read-only file second time to write a text by giving
			// setWritable(true)
			file.setWritable(true);
			
			

			boolean success1 = file.canWrite();

			if (success1) {

				writer = new FileWriter(file);

				writer.append("Again adding text into the file");

				writer.close();

				FileReader reader1 = new FileReader(file);

				String output1 = "";

				int c1 = reader1.read();

				while (c1 != -1) {
					output1 += (char) c1;
					c1 = reader1.read();
				}

				System.out.println("Reading File, After adding the new text " + output1);

				reader1.close();

			} else {
				System.out.println("file is Read-only can't add the text");
			}

		} catch (IOException e) {
			System.out.println("Unable to create file " + fileName);
		}
	}

}
