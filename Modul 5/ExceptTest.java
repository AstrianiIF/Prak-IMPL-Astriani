package counter;

import java.io.*;

public class ExceptTest {
	
	public static void main(String[] args) {
		try {
			int[] a = new int[2];
			System.out.println("Access element three: " + a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception thrown: " + e);
		}
		
		FileInputStream file = null;
		String fileName = "nonexistentfile.txt";
		try {
			file = new FileInputStream(fileName); 
			int x = file.read(); 
		} catch (FileNotFoundException f) {
			System.out.println("File not found: " + f);
		} catch (IOException i) {
			System.out.println("IOException occurred: " + i);
		} finally {
			try {
				if (file != null) {
					file.close(); 
				}
			} catch (IOException e) {
				System.out.println("Error closing file: " + e);
			}
		}
		
		System.out.println("Out of the block");
	}
}
