import java.util.*;

public class Aliasing3 {
	public static void main(String[] params) {
        int[] arr = {1, 2, 3, 4, 5};
        ListNode node = fill(arr);
        print(node);
		System.exit(0);
	}

	public static ListNode fill(int[] arr) {
		ListNode head = new ListNode(0);
		ListNode current = new ListNode(0);
		current = head; // head is a referrencing the start of the current node
		for(int i=0; i<arr.length; i++) {
			current.next = new ListNode(0);
			current.next.val = arr[i];
			current = current.next; // point the current node to the next node
		}
		return head.next; // head returns the full list using pass by referrence 
	}

	public static void print(ListNode node) {
    	System.out.println("print listnode: ");
        while (node != null) {
        	System.out.print(node.val);
        	node = node.next;
        } 
        System.out.println(); 
	}
}

class ListNode {
	int val;
	ListNode next;

	public ListNode(int v) {
		this.val = v;
	}
}