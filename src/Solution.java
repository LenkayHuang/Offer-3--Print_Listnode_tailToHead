/**
 *    public class ListNode {
 *        int val;
 *        ListNode next = null;
 *
 *        ListNode(int val) {
 *            this.val = val;
 *        }
 *    }
 *
 */
import java.util.ArrayList;
public class Solution {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ListNode head = listNode;
        ListNode pre=null;
        ListNode next;

        while(head!=null) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        ListNode index = pre;
        ArrayList<Integer> list = new ArrayList<>();
        while(index!=null) {
            list.add(index.val);
            index = index.next;
        }
        return list;
    }

    public static void main(String args[]) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;

        System.out.print(Solution.printListFromTailToHead(n1));
    }
}

    class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }