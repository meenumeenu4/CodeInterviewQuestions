/**
 * 
 */
package com.probs;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Problem Statement: Given two strings a and b , that may or may not be same
 * length determine minimum number of character deletion required to make a and
 * b anagrams. Any character can be deleted from either of the strings. We
 * consider two strings to be anagrams of each other if the first string's
 * letters can be rearranged to form the second string.
 * 
 * 
 * 
 * @author bhatiam0
 *
 */
public class Anagrams {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = in.nextLine();

		System.out.println("String a is : " + a);
		System.out.println("String b is : " + b);

		int n = makeAmagram(a, b);
		System.out.println("Characters tobe removed are : " + n);

	}

	private static int makeAmagram(String a, String b) {
		int count = 0;
		char[] aArray = a.toCharArray();
		char[] bArray = b.toCharArray();

		Arrays.sort(aArray);
		Arrays.sort(bArray);

		int ai = 0;
		int bi = 0;

		while (ai < a.length() && bi < b.length()) {
			if (aArray[ai] < bArray[bi]) {
				ai++;
				count++;
			} else if (aArray[ai] > bArray[bi]) {
				bi++;
				count++;
			} else {
				ai++;
				bi++;
			}
		}

		if (ai < a.length()) {
			count = count + (a.length() - ai);
		}

		if (bi < b.length()) {
			count = count + (b.length() - bi);
		}


		return count;
	}

}
