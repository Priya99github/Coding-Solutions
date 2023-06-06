package com.mindcraft;

public class VowelsConsonentsCount {

	public static void main(String[] args) {
		String str = "Padmapriya";
		char [] ch = str.toCharArray();
		int vowels = 0;
		int consonents = 0;
		
		for (int i=0; i<str.length(); i++) {
			if (ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
				vowels++;
			}
			else {
				consonents++;
			}
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonents = "+consonents);
	}

}
