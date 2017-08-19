package stringIteration;

public class StringIterate {
	public static StringBuilder remove(String input, char b) {

		//initializing string builder
		StringBuilder sb = new StringBuilder();
		//checking if the input string has value and if there are no trailing and leading spaces and iterating each char
		if (input.isEmpty()== false && input.trim().isEmpty()== false) {
			for (int i = 0; i < input.length(); i++) {
				if (input.charAt(i) != b) {
					sb.append(input.charAt(i));
				}
			}
		}
		return sb;
	}

	public static void main(String[] args) {

		System.out.println(StringIterate.remove("Program to remove a character", 'r'));
	}
}