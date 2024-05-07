package BasicProgramPractice;

public class StringPrograms {

	public static void main(String[] args) {
		int countofAlphabet = 0;
		int countofNumeric = 0;
		String name = "ShwetPrasadChakkarwar2805";
		char[] c1 = name.toCharArray();
		for (int i = 0; i < name.length(); i++) {
			// System.out.println(c1[i]);
			boolean anw = Character.isAlphabetic(c1[i]);
			boolean anw1=Character.isDigit(c1[i]);
			if (anw == true) {
				countofAlphabet++;
			}
			if (anw1 == true) {
				countofNumeric++;
			}
		}
		System.out.println("the count of alphabet is:" + countofAlphabet);
		System.out.println("the count of Numeric is:" + countofNumeric);

	}

}
