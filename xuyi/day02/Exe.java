public class Exe {
	public static void main(String[] args) {
		int[][] s = new int[20][7];
		String[] bt = { "coreC++", "coreJava", "   Servlet", "   JSP","      EJB", "     总分", "     平均分" };
		for (int i = 0; i < bt.length; i++) {
			System.out.print(bt[i] + "  ");
		}
		System.out.println();
		for (int h = 0; h < s.length; h++) {
			int m = 0;
			for (int l = 0; l < 5; l++) {
				s[h][l] = (int) (Math.random() * 90 + 10);
				m = m + s[h][l];
				System.out.print("  " + s[h][l] + "       ");
			}
			System.out.print(m);
			System.out.print("        " + m / (s[h].length - 2));
			System.out.println();
		}
	}
}

