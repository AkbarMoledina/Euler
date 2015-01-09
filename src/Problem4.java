//Largest palindrome product

public class Problem4 {
	
	public static void main(String[] args) {

		for (int x = 10; x < 100; x++) {
			for (int y = 10; y < 100; y++) {
				int z = x * y;
				String s = Integer.toString(z);
				char a = s.charAt(0);
				if (s.length() == 3) {
					char c = s.charAt(2);
					if (a == c)
						System.out.println(z);
				}
				else if (s.length() == 4) {
					char b = s.charAt(1);
					char c = s.charAt(2);
					char d = s.charAt(3);
					if (a==d && c==b)
						System.out.println(z);
				}
			}
		}
	}
}
