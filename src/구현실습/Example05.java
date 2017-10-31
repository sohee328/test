package 구현실습;

public class Example05 {
	static String removeNonAlphabet(String s) {
		StringBuilder builder = new StringBuilder();
		
		for (int i = 0; i < s.length(); ++i) {
			char c = s.charAt(i);
			if (Character.isAlphabetic(c))
				builder.append(c);
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		String s = " a#b.c__d$$$e++++f;;;g...h///i%";
		s = removeNonAlphabet(s);
		System.out.println(s);
	}

}
