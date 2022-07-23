package RegularExp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
	public static void main(String[] args) {

		String regex = "[a-z]+";
		String input = "1223";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);

		if (match.matches()) {
			System.out.println("Pattern Matched");
		} else {
			System.out.println("Invalid Input");
		}
	}
}
