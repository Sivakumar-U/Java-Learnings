package com.fullstack.checkedexceptions;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Demonstrate program to trigger IOException using File and Scanner.
 * IoException is the parent to the FileNotFoundException. so it will handle the
 * both IOException and FileNotFoundException as well.
 */
public class IOExceptionExample {

	public static void main(String[] args) {

		String fileName = "C:\\Users\\usiva\\OneDrive\\Desktop\\Java\\MyTextFile.txt";// Here if we change file name
																						// then it will throw
																						// FileNotFoundException.

		File file = new File(fileName);
		try {
			Scanner sc = new Scanner(file);
			System.out.println("Hurray!! I have found the file " + fileName);
		} catch (IOException ie) {
			System.out.println("Cannot find file," + fileName + " So java triggers IOException here!");
			ie.printStackTrace();
		}
	}

}
