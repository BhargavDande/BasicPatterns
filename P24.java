/*Write a Java Program to print Alpha pattern given below. 
Example :
input : 4
output :
a       
a b     
a b c   
a b c d               */

package patterns_solid;

import java.util.Scanner;

public class P24 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a value : ");
		int n = ip.nextInt();
		for (int r = 1; r <= n; r++) {
			char ch = 'a';
			for (int c = 1; c <= n; c++) {
				if (r >= c) {
					System.out.print(ch + " ");
					ch++;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
