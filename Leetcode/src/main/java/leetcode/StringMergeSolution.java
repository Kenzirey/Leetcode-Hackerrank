package leetcode;

public class StringMergeSolution {
	public static String mergeAlternately(String word1, String word2) {
		StringBuilder builder = new StringBuilder();

		//Keeps track of which index we are at, so that we alternate the append every other "word" / string.
		int index = 0;

		//Goes through and appends 1 time per index for word1 & word 2.
		while (index < word1.length() || index <word2.length()) {
			if (index < word1.length()) {
				builder.append(word1.charAt(index));
			}
			if (index < word2.length()) {
				builder.append(word2.charAt(index));
			}
			index++;
		}
		return builder.toString();
	}

	public static void main(String[] args) {
		System.out.println(mergeAlternately("abc", "pqr"));
	}

}
