public class Problem4b {

	private static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		for (int j = s.length(); j > 0; j--) {
			sb.append(s.charAt(j - 1));
			String a = sb.toString();
			if (s.equals(a)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {

		int greatest = 0;
		for (int x = 100; x < 1000; x++) {
			for (int y = 100; y < 1000; y++) {
				int product = x * y;
				String sProduct = Integer.toString(product);
				isPalindrome(sProduct);
				
				if (isPalindrome(sProduct)){
					
					if (product > greatest)
						greatest = product;
				}
			}
		}
		
		System.out.println(greatest);
	}
}
