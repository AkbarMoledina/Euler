public class Problem7b {

	public void solve(int finalPrime) {

		int numberPrime = 0;
		int divisor;
		int number = 2;
		int prime;

		do {
			if (number % 2 == 0) {
			}
			else {
				for (divisor = 3; divisor < Math.sqrt(number); divisor += 2) {
					if (number % divisor == 0) {
					}
					else{
						System.out.println("Prime");
						numberPrime++;
					}
						
				}
			}
		} while (numberPrime <= finalPrime);

	}

	public static void main(String[] args) {

		Problem7b prog = new Problem7b();
		prog.solve(6);

	}
}
