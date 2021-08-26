package day16_17;

import java.util.ArrayList;

public class PrimeNumber {

	public static void main(String[] args) {
		int startingRange = 1;
		int endingRange = 1000;
		for (int i = startingRange; i < endingRange; i++) {
			if(isPrime(i)) {
				
				System.out.println();
				System.out.print("Prime no: "+i);
				if(palindrome(i)) {
					System.out.print(" is Palindrom too ");						
					}
			
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean palindrome(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			rev = rev * 10 + temp % 10;
			temp = temp / 10;
		}
		return rev == n;
	}

}
