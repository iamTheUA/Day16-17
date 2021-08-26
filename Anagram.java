package day16_17;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String: ");
		String st1 = sc.next();
		System.out.println("Enter Second String: ");
		String st2 = sc.next();
		anagram(st1, st2);
		sc.close();
	}

	public static void anagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		if (c1.length == c2.length) {
			for (int i = 0; i < c1.length; i++) {
				int flag = 0;
				for (int j = 0; j < c1.length; j++) {
					if (c1[i] == c2[j]) {
						flag = 1;
					}
				}
				if (flag == 0) {
					System.out.println("Not an Anagram");
					return;
				}
			}
			System.out.println("It's an Anagram");
		} else {
			System.out.println("Not an Anagram");
			return;
		}
	}
}
