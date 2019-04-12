package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		File file = new File("C:\\Users\\bb8ga119\\Documents\\Eclipse-Workspace\\textFiles\\in.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally { // fechar o scanner independente se estiver erro ou não.
			if (sc != null) {
				sc.close();
			}
		}
	}

}
