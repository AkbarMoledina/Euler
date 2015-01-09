// Even Fibonacci Numbers

public class Problem2 {
	public static void main(String[] args) {
		
		long a = 0;
		long b = 0;
		long c = 1;
		long sum = 0;
		
		for (; a < 4000000;) {
			a = b + c;
			b = c;
			c = a;
			
			if (a % 2 == 0) {
				sum += a;
			}
		}
		System.out.println("The sum of the even Fibonacci values that are less than 4 Million is " + sum);
	}
}
