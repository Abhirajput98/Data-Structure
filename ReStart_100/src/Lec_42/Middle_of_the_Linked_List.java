package Lec_42;

import Lec_41.LinkedList;

public class Middle_of_the_Linked_List{
        public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
 ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        }
        public ListNode middleNode(ListNode head) {
                ListNode fast = head;
                ListNode slow = head;
                while(fast!=null &&fast.next!=null){
                        fast =fast.next.next;
                        slow=slow.next;

                }
                return slow;



        }


        }
