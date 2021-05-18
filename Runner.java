public class Runner {
    public static void main(String[] params) {
        FloydsCycle _Cycle = new FloydsCycle();

        int[] a1 = {3, 5, 0, -4};
        int[] a2 = {3, 5, 0, -4, 1, 5, 7, 8};
        int[] a3 = {3, 5, 0, -4};

        ListNode node = _Cycle.fill(a1);
        // create a cycle
        node.next.next.next.next = node.next.next;
        ListNode node2 = _Cycle.fill(a2);
        ListNode node3 = _Cycle.fill(a3);

        boolean hasCycle = _Cycle.detectLoop(node);
        boolean hasCycle2 = _Cycle.detectLoop(node2);
        boolean hasCycle3 = _Cycle.detectLoop(node3);
        System.out.println("node has cycle: " + hasCycle);
        System.out.println("node 2 has cycle: " + hasCycle2);
        System.out.println("node 3 has cycle: " + hasCycle3);
    	System.exit(0);
    }
}