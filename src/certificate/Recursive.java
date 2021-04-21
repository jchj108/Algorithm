package certificate;

public class Recursive {

	public static void main(String[] args) {

		int n = recur(7);
		System.out.println();
		System.out.println(n);
		
		
	}

	private static int recur(int i) {
		System.out.print(i + " ");
		if(i < 1) {
			return 2;
		} else {
			return 3 * recur(i-1) + 1;
		}
	}
}
