// Largest prime factor

public class Problem3 {

	private void solve(long number) {
		long greatest = 0;
		
		for (long i = 3; i < Math.sqrt(number); i += 2) {
			
			if (number % i == 0)
				if (i > greatest)
					greatest = i;
		}
		System.out.println(greatest);
	}

	public static void main(String[] args) {
		Problem3 prog = new Problem3();
		prog.solve(13195); // should be 29
		prog.solve(600851475143L); //what we are trying to find
		

	}
}
