package RegularExp;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex3 {
	public static void main(String[] args) {

		String regex = "[A-Za-z]+";
		String input = "Regular Expression";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		while (match.find()) {
			System.out.println(input.substring(match.start(), match.end()));

		}

	}

}
