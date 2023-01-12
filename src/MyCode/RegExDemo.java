package MyCode;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RegExDemo {


	public static void useRegEx() {
		
		Pattern pattern  =  Pattern.compile("^This", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher("This is Deshpande");
		boolean found = matcher.find();
		if(found)
			System.out.println("String found");
		else
			System.out.println("String NOT found");
	}
}
