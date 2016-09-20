package com.algorithm.week19;

public class ReverseStringByWord {
	
	private static String reverseStringByWord(String str) {
		
		StringBuilder sb = new StringBuilder();
		
		// Split string in array of word by space
		String[] wordArray = str.split("\\s");
		int length = wordArray.length;
		for (int index = length - 1; index >= 0; index --) {
			sb.append(wordArray[index]).append(" ");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		String str = "This is a test.";
		System.out.println("Before reverse: " + str);
		System.out.println("After reverse: " + reverseStringByWord(str));
	}

}
