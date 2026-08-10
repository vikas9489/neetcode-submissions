/**
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun reverseList(head: ListNode?): ListNode? {

            var next:ListNode?=null
            var current:ListNode?=head
            var previous:ListNode?=null

            while(current!=null)
            {
                next=current.next
                current.next=previous
                previous=current
                current=next

            }
            return previous
    }
}
