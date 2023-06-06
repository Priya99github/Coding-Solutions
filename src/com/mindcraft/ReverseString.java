package com.mindcraft;

public class ReverseString {

	public static void main(String[] args) {
		String str = "Padmapriya";
		char [] ch = str.toCharArray();
		
		for (int i=str.length()-1; i>=0; i--) {
			System.out.print(ch[i]);
		}

	}

}
