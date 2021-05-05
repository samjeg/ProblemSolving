public class Runner {
    public static void main(String[] params) {
        FloydsCycle _Cycle = new FloydsCycle();

        int[] a1 = {3, 5, 0, -4};
        int[] a2 = {3, 5, 0, -4, 1, 5, 7, 8};

        ListNode node = _Cycle.fill(a1);
        ListNode node2 = _Cycle.fill(a2);

        boolean hasCycle = _Cycle.detectLoop(node2);
        System.out.println("node 2 has cycle: " + hasCycle);
    	System.exit(0);
    }
}