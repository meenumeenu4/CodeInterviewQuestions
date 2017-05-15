/**
 * 
 */
package com.probs;

import java.io.Console;
import java.util.Arrays;

/**
 * A left rotation operation on an array of size shifts each of the array's
 * elements unit to the left. For example, if left rotations are performed on
 * array , then the array would become .
 * 
 * Given an array of integers and a number, , perform left rotations on the
 * array. Then print the updated array as a single line of space-separated
 * integers.
 * 
 * @author bhatiam0
 *
 */
public class LeftRotateArray {

	public static void main(String args[]) {

		// TODO: Console class doen't work from eclipse.
		Console console = System.console();
		System.out.println("Got Console: " + console);
		Integer arrayLength = null;
		Integer rotation = null;
		String array[] = null;

		if (null != console) {
			arrayLength = Integer.valueOf(console.readLine("Array Length: "));
			rotation = Integer.valueOf(console.readLine("No of rotations: "));
			String input = console.readLine("Array Values: ");
			array = input.split(" ");
		}

		System.out.println("Array Length :" + arrayLength);
		System.out.println("No of rotations : " + rotation);
		System.out.println("Input array is : " + Arrays.asList(array));
		System.out.println("");

		//rotating
		for (int i = 0; i < rotation; i++) {
			String temp = array[0];
			for (int j = 1; j < arrayLength; j++) {
				array[j - 1] = array[j];
			}
			array[arrayLength - 1] = temp;
			System.out.println("Output  array is after rotation : " + Arrays.asList(array));

		}
	}

}
