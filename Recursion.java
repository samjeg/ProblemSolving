

class Recursion {
    public static void main(String[] args) {
    	String s = "the boss";

    	String result = reverse(s);
    	System.out.println("the boss: " + result);

    	int[] n = {5, 2, 7, 3};

    	int sum = sum(n, 0);
    	System.out.println("sum: "+ sum);

    	int largest = largest(n, 0);
    	System.out.println("largest: " + largest);
    	System.exit(0);
    }


	public static String reverse(String s) {
		// base case
		if (s.length() <= 1) return s;

		// recursively reversing string
		return reverse(s.substring(1)) + s.charAt(0);
	}

	public static int sum(int[] n, int idx) {
	    int next = n[idx];
	    
	    // base case
	    if (idx == n.length - 1) return next;    
        
        // recursively adding the integers in the array
        return sum(n, idx + 1) + next;
	}

	public static int largest(int[] n, int idx) {
		int next = n[idx];

		// base case
		if (idx == n.length - 1) return next;

        // recursively get the largest number from array
		return Math.max(largest(n, idx + 1), next);
	}
}