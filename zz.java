class zz {

	// A recursive function to find nth catalan number

	public static long catalan(int n) {
		long res = 0;
		
		// Base case
		if (n <= 1) {
			return 1;
		}
		for (int i = 0; i < n; i++) {
			res += catalan(i) * catalan(n - i - 1);
		}
		return res;
	}

	public static void main(String[] args) {
		//CatalnNumber cn = new CatalnNumber();
		for (int i = 0; i < 30; i++) {
			System.out.print(catalan(i) + ",");
		}
	}
}
