package rapidRadish;

import java.util.*;

public class RapidRadish {

	public static void main(String[] args) {
		boolean booScary = true;
		
		do {
		Scanner scanner = new Scanner(System.in);
		String lmao = scanner.nextLine();
		if (!lmao.equals("stop")) {
			System.out.println(lmao + " is a stupid thing to say");
		} else {
			System.out.println("aight bruh");
			scanner.close();
			booScary = false;
		}
		
		} while (booScary);
	}

}
