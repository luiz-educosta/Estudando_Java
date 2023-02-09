package idiomaSistema;

import java.util.Locale;

public class IdiomaSistema {
	public static void main (String[] args) {
		Locale locale = Locale.getDefault();
		String lang = locale.getDisplayLanguage();
		System.out.println("Seu sistema esta em " + lang);
	}
}
