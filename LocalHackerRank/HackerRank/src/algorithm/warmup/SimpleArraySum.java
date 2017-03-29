package algorithm.warmup;

/**
 * Given an array of integers, can you find the sum of its elements?
 * 
 * Input Format
 * 
 * The first line contains an integer, , denoting the size of the array. The
 * second line contains space-separated integers representing the array's
 * elements.
 * 
 * Output Format
 * 
 * Print the sum of the array's elements as a single integer.
 * 
 * Sample Input
 * 
 * 6 1 2 3 4 10 11
 * 
 * Sample Output
 * 
 * 31
 * 
 * @author RichBear
 */

import java.util.Scanner;

public class SimpleArraySum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */

		Scanner in = new Scanner(System.in);
		int length = in.nextInt();
		int[] array = new int[length];
		int sum = 0;
		for (int i = 0; i < length; i++) {
			array[i] = in.nextInt();
			sum += array[i];
		}

		System.out.println(sum);

	}
}
