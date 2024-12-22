/*Write a Java Program to print Number pattern given below. 
Example :
input : 4
output :
1       
2 3     
4 5 6   
7 8 9 10             */

package patterns_solid;

import java.util.Scanner;

public class P21 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = ip.nextInt();
		int s = 1;
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(s + " ");
					s++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
