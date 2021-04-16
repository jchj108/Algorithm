package certificate;

import java.util.Scanner;

public class Factorization {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n, c, k;
		int s[] = new int[10];

		while (true) {
			n = sc.nextInt();
			if (n < 2) {
				break;
			}
			c = -1;

			do {
				k = 2;
				while (n % k != 0) {
					k++;
				}
				c++;
				s[c] = k;
				n /= k;
			} while (n != 1);

			if (c == 0) {
				System.out.println("¼Ò¼ö");
			} else {
				for (int i = 0; i <= c-1; i++) {
					System.out.printf("%dX", s[i]);
				}
				System.out.printf("%d", s[c]);
			}
		}
		sc.close();
	}
}
