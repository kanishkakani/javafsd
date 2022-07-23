package RegularExp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex4 {
	public static void main(String[] args) {

		String regex = "^(?=.*[A-Z]).{8,}";
		String input = "1323DAS3";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		if (match.matches()) {

			System.out.println("Password is valid");

		} else {

			System.out.println("Invalid Password");
		}

	}

}
