package strings_Ex;

public class ReversStringUsingStringBuffer {

	public static void main(String[] args) {
		String str = "Hello, World!";
		String reversed = reverseString(str);
		System.out.println("Original string: " + str);
		System.out.println("Reversed string: " + reversed);
	}

	public static String reverseString(String str) {

		StringBuffer stringBuffer = new StringBuffer(str);

		stringBuffer.reverse();

		String reversedString = stringBuffer.toString();

		return reversedString;
	}
}