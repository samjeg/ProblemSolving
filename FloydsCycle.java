
class FloydsCycle {

    public boolean detectLoop(ListNode head) {
	    ListNode tortoise = head;
	    ListNode hare = head;
	    while(hare!=null&&hare.next!=null) {
	        if(hare.val == tortoise.val) return true;
	        
	        tortoise=tortoise.next;
	        hare=hare.next.next;
	    }
       return false;
    }

    public void print(ListNode head) {
    	while (head != null) {
    		System.out.println("value: " + head.val);
    		head = head.next;
    	}
    }
    
    public ListNode fill(int[] arr) {
    	if (arr.length == 0) return null; 
    	ListNode dummy = new ListNode(arr[0]);
    	ListNode node = new ListNode(arr[0]);
    	node = dummy;
    	int i = 1;
        
        // fill linkedlist with integer array
    	while(i < arr.length) {
    		// System.out.println("node value: " + node.val + " i: " + i);
	        node.next = new ListNode(arr[i]);
	        node = node.next;
	        i++;
    	}
	    return dummy;
    }
} 