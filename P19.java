/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
1       
1 2     
1 2 3   
1 2 3 4               */

package patterns_solid;

import java.util.Scanner;

public class P19 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = ip.nextInt();
		for (int r = 1; r <= n; r++) {
			int s = 1;
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(s + " ");
				} else {
					System.out.print("  ");
				}
				s++;
			}
			System.out.println();
		}
	}
}
