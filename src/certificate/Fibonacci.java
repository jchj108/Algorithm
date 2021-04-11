package certificate;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		// 제 1항부터 제 N항까지 피보나치 수열의 합을 구하시오
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int c;
		int sum = 2;
		int n = sc.nextInt();
		
		for(int i=3; i<=n; i++) {
			c = a + b;
			sum += c;
			a = b;
			b = c;

		}
		System.out.println(sum);
		
		
	}

}
