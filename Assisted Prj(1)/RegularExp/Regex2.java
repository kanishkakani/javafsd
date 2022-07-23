package RegularExp;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class Regex2 {
	public static void main(String[] args) {
		String regex = "[987]{3}[0-9]{7}";
		// num start either 9,8 or 7 and rest b/w 0 to 9
		String input = "9783897364";
		Pattern pattern = Pattern.compile(regex);
		Matcher match = pattern.matcher(input);
		if (match.matches()) {
			System.out.println("Pattern Matched");
		} else {
			System.out.println("Invalid Input");
		}

	}

}
