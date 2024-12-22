/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
a       
b c     
d e f   
g h i j              */

package patterns_solid;

import java.util.Scanner;

public class P22 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = ip.nextInt();
		char a = 'a';
		for (int r = 1; r <= n; r++) {
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(a + " ");
					a++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
