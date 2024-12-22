/*Write a Java Program to print Solid pattern given below. 
Example :
input : 4
output :
* * * * 
*     * 
*     * 
* * * *   */

package patterns_solid;

import java.util.Scanner;

public class P12 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r == 1 || c == 1 || r == n || c == n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
