class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode cur=dummy;
        while(cur.next!=null && cur.next.next!=null)
        {
           ListNode first=cur.next;
           ListNode second=cur.next.next;
            if(first.val==second.val)
            {
                cur.next=second;
                if(second.next==null || second.val!=second.next.val)
                    cur.next=second.next;
            }
            else
                cur=cur.next;
        }
        return dummy.next;
    }
}
