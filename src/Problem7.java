// 10001st prime
public class Problem7 {
	public void solve(int numberPrime) {

		System.out.println(numberPrime);
		int currentNumberPrime = 0;
		int number;
		int divisor = 2;
		boolean prime = false;
		boolean run = true;

		while (currentNumberPrime < numberPrime) {
			for (number = 2; currentNumberPrime < numberPrime; number++) {
				if (number % 2 == 0) {
					prime = false;
					run = false;
				} else
					run = true;

				while (run == true) {
					for (divisor = 3; divisor < Math.sqrt(number); divisor += 2) {
						if (number % divisor == 0)
							prime = true;
						else
							prime = false;
						if (prime) {
							currentNumberPrime++;
							System.out.println(number + "is Prime");
						}
					}
				}

			}

		}
	}

	public static void main(String[] args) {
		Problem7 prog = new Problem7();
		prog.solve(6); // Should be 13
		// prog.solve(10001);

	}

}
