/*Write a Java Program to print Solid pattern given below. 
Example :
input : 3
output :
*       * 
  *   *   
    *     
  *   *   
*       *    */

package patterns_solid;

import java.util.Scanner;

public class P13 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter n value : ");
		int n = ip.nextInt();
		for (int r = 1; r <= 2 * n - 1; r++) {
			for (int c = 1; c <= 2 * n - 1; c++) {
				if (r == c || r + c == (2 * n)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
