package algorithm.warmup;

import java.util.Scanner;

/**
 * this is the easy summation program, mainly to practice the input interface
 *
 * ===== sample input =====
 *  4
 *  3
 *
 *  ===== sample output =====
 *  7
 */

public class SolveMeFirst {
	static int solveMeFirst(int a, int b) {
		// Hint: Type return a+b; below
		return a + b;
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a;
		a = in.nextInt();
		int b;
		b = in.nextInt();
		int sum;
		sum = solveMeFirst(a, b);
		System.out.println(sum);
	}
}
