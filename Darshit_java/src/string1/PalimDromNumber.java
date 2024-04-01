package string1;

public class PalimDromNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int n = 0; n <= 100; n++) {
			int n1 = 0;
			int n2 = n;
			while (n2 != 0) {
				int last = n2 % 10;
				n1 = n1 * 10 + last;
				n2 = n2 / 10;
			}
			if (n1 == n) {
				System.out.println(n1);
			}
		}
	}
}
