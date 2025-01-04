package com.fullstack.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class NioFileReaderExample {

	public static void main(String[] args) {

		Path path = Paths.get("example.txt");

		try {
			List<String> lines = Files.readAllLines(path);
			System.out.println(lines);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
