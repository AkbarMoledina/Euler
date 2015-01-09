//Smallest multiple

public class Problem5b {
	
	private void solve(int multiple) {
		int i = 20;
		boolean run = true;
		while (run) {
			run = false;
			for (int x = multiple; x > 2; x--) {
				if (i % x != 0) {
					i +=20;
					run = true;
				}
			}
		}
		System.out.println(i);
	}

	public static void main(String[] args) {
		Problem5b prog = new Problem5b();
		prog.solve(10);
		prog.solve(20);
		

	}
}
