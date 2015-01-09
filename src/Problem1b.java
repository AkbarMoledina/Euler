// Multiples of 3 and 5

public class Problem1b {

	private void solve(int limit) {
		int sum = 0;
		for (int i = 1; i < limit; i++) {
			if (i % 3 == 0 || i % 5 == 0) {
				sum += i;
			}
		}
		System.out.println("The sum of all the multiples of 3 or 5 below " + limit + " is " + sum);
	}

	public static void main(String[] args) {
		Problem1b prog = new Problem1b();
		prog.solve(10); //should be 23
		prog.solve(1000); //what we are trying to find
	}
}
