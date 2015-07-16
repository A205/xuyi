public class xiaowu {
	public static void main(String args[]) {
		int i, j;
		int sum = 1;
		for (i = 2; i <= 100; i++) {
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					break;
				}
				if (j >= (i - 1)) {
					sum = sum + 1;
				}
			}

		}
		System.out.println("质数的个数为" + sum);
	}
}