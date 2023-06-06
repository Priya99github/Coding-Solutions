package com.mindcraft;

public class OddEvenCount {

	public static void main(String[] args) {
		int [] a = {1, 3, 4, 5, 7, 9, 12, 45, 99, 78};
		int even =0;
		int odd =0;
		
		for (int i=0; i<a.length; i++) {
			if (a[i]%2==0) {
				even++;
			}
			else {
				odd++;
			}
		}
		System.out.println("Even : "+even);
		System.out.println("Odd : "+odd);
	}

}
