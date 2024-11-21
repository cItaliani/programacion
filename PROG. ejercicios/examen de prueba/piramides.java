public class piramides {

	public static void main(String[] args) {
		int i;
		for ( i = 10; i <=1; i--) {
			for (int j = i; j >=1; j--) {
				System.out.printf("%2d", j);
			}
			System.out.println();
		}
	}
}