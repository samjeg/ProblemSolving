

class StringReverser {
    public static void main(String[] args) {
    	String s = "the boss";

    	String result = reverse(s);
    	System.out.println("the boss: " + result);
    	System.exit(0);
    }


	public static String reverse(String s) {
		// base case
		if (s.length() <= 1) return s;

		// recursively reversing string
		return reverse(s.substring(1)) + s.charAt(0);
	}
}