package algorithm.warmup;

import java.util.Scanner;

/**
 * @formatter:off
 * 
 * Given a square matrix of size , calculate the absolute difference between the
 * sums of its diagonals.
 * 
 * =====Input Format=====
 * 
 * The first line contains a single integer, . The next lines denote the
 * matrix's rows, with each line containing space-separated integers describing
 * the columns.
 * 
 * =====Output Format=====
 * 
 * Print the absolute difference between the two sums of the matrix's diagonals
 * as a single integer.
 * =====Sample Input=====
 * 3
 * 11    2    4
 * 4     5    6
 * 10    8    -12
 * 
 * =====Sample Output=====
 * 
 * 15
 * 
 * =====Explanation=====
 * 
 * The primary diagonal is:
 * 11
 *       5
 *            -12
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * 
 * The secondary diagonal is:
 *            4
 *      55
 * 10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19
 * Difference: |4 - 19| = 15
 * 
 * @author RichBear
 *
 */
public class DiagonalDifference {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        in.nextLine();

        int primary = 0;
        int secondary = 0;

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < width; j++) {
                int v = in.nextInt();
                if (i == j)
                    primary += v;
                if (i + j == (width - 1))
                    secondary += v;
            }
            in.hasNextLine();
        }

        int difference = Math.abs(primary - secondary);
        System.out.println(difference);
    }
}
