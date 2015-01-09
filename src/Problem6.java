// Sum square difference

public class Problem6 {
	public void solve(int max) {
		
		int sum = 0;
		int sumsq = 0;
		int sqsum = 0;
		int diff = 0; 
		
		for (int i = 1; i <= max; i++) {
			sum += i;
			sumsq += i*i;
			sqsum = sum*sum;
			
			diff = sqsum - sumsq;
			
		}
		System.out.println("The sum of the squares = " + sumsq);
		System.out.println("The square of the sum = " + sqsum);
		System.out.println("The difference is = " + diff);
		
	}

	public static void main(String[] args) {
		Problem6 prog = new Problem6();
		prog.solve(10);
		prog.solve(100);

	}
}
