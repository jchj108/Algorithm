package certificate;

public class Modular {

	public static void main(String[] args) {

		int i = 10, hap = 0;
		while(i>1) {
			i--;
			if(i%3==1) {
				hap += i;
			}
			System.out.printf("%d\n", hap);
			
		}
	}

}
