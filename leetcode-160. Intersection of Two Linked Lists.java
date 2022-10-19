public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode ptrA = headA, ptrB = headB;
    while (ptrA != ptrB) { 
        ptrA = ptrA == null ? headB : ptrA.next; 
        ptrB = ptrB == null ? headA : ptrB.next;
	}
	return ptrA;
}
}