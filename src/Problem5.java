//Smallest multiple

public class Problem5 {

	public static void main(String[] args) {
		
		int smallest = 1000000000;
		for (int i = 10; i < 1000000000; i += 10) {
			if (i % 7 == 0 && i % 9 == 0 && i % 11 == 0 && i % 12 == 0 && i % 13 == 0 && i % 14 == 0 && i % 15 == 0&& i % 16 == 0 && i % 17 == 0 && i % 18 == 0 && i % 19 == 0 && i % 20 == 0) {
				if (smallest > i)
					smallest = i;
			}
		}
		System.out.println(smallest);
		
	}
}
