package br.com.reger.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.servlet.ServletException;

public class RegexUtil {
	//private static final Pattern regexAll = Pattern.compile("/usuario");
	//private static final Pattern regexById = Pattern.compile("/usuario/([0-9]*)");
	private static Pattern regexAll;
	private static Pattern regexById;

	public static Long matchId(String requestUri, String partialUri) throws ServletException {
		regexAll = Pattern.compile(partialUri);
		regexById = Pattern.compile(partialUri + "/([0-9]*)");

		Matcher matcher = regexById.matcher(requestUri);
		if (matcher.find() && matcher.groupCount() > 0) {
			String s = matcher.group(1);
			if (s != null && s.trim().length() > 0) {
				Long id = Long.parseLong(s);
				return id;
			}
		}
		return null;
	}

	public boolean matchAll(String requestUri, String partialUri) throws ServletException {
		regexAll = Pattern.compile(partialUri);
		regexById = Pattern.compile(partialUri + "/([0-9]*)");
		
		Matcher matcher = regexAll.matcher(requestUri);
		if (matcher.find()) {
			return true;
		}
		return false;
	}

}
