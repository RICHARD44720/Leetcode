/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
       int c=0;
       ListNode ans =new ListNode(0,head);
ListNode dummy=ans;
            ListNode temp=head;
            while(temp!=null){
                temp=temp.next;
c++;
            }
           int a=c-n;ListNode s=dummy;int b=0;           
           if(head.next==null && n==1){
            return null;
           }
           while(s!=null && s.next!=null){
           if(b==a){s.next=s.next.next;}
           else{
            s=s.next;
           }b++;
           }
        System.out.print(a);
       return ans.next;
    }
}