package p230428;

import java.util.Scanner;

public class t1157 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
//		int s = 84;
		scan.close();
		
		if (s >=90) {
			System.out.print("A");
			if(s >=95) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}else {
			System.out.print("B");
			if (s >=85 ) {
				System.out.print("+");
			}else {
				System.out.print("-");
			}
		}
	}
}