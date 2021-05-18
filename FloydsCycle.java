
class FloydsCycle {
    public boolean detectLoop(ListNode head) {
        ListNode tortoise = head;
        ListNode hare = head;
        while(hare!=null&&hare.next!=null) {
            tortoise=tortoise.next;
            hare=hare.next.next;
            
            if(hare == tortoise) return true; // loop detected
        }
        return false;
    }

    public void print(ListNode head) {
        while (head != null) {
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
            node.next = new ListNode(arr[i]);
            node = node.next;
            i++;
        }
        return dummy;
    }
} 