import java.util.*;

public class Aliasing {
	public static void main(String[] params) {
        testVariables();
        testArrays();
        testArrays2();
        testArrayLists();
		System.exit(0);
	}

    // Simple primitive assignment statement copies values:
	public static void testVariables() {
		int x = 1;
		int y = x; // x copied into y
		x = 2;
		System.out.println("variables");
		System.out.println("x: " + x); // prints 2
		System.out.println("y: " + y); // prints 1
	}

    // Arrays are 'aliased' during assignment statements:
	public static void testArrays() {
		int[] x = {1, 2, 3, 4, 5};
		int[] y = x; // x is aliased to y
		x[0] = 6;
		System.out.println("arrays");
		System.out.println("x[0]: " + x[0]); // prints 6
		System.out.println("y[0]: " + y[0]); // prints 6
	}

    // If you assign one of the variables a completely different array, this aliasing 'disappears':
	public static void testArrays2() {
		int[] x = {1, 2, 3, 4, 5};
		int[] y = x; // x is aliased to y
		x = new int[]{1, 2, 3, 4, 5}; // a new array is aliased to x
		x[0] = 6;
		System.out.println("arrays 2");
		System.out.println("x[0]: " + x[0]); // prints 6
		System.out.println("y[0]: " + y[0]); // prints 1
	}

	public static void testArrayLists() {
        int[] arr = {1, 2, 3, 4, 5};
        List<Integer> ls1 = fill(arr);
        List<Integer> ls2 = ls1; // ls1 is aliased to ls2
        ls1 = fill(arr); // a new list is aliased to ls1
        ls1.set(0, 6);
		System.out.println("arraylist");
		System.out.println("ls1 0: " + ls1.get(0)); // prints 6
		System.out.println("ls2 0 " + ls2.get(0)); // prints 1
	}

	public static List<Integer> fill(int[] arr) {
		List<Integer> ls = new ArrayList<>();

		for(int i=0; i<arr.length; i++) {
			ls.add(arr[i]);
		}
		return ls;
	}
}