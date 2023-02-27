package leetcode;

import glovo.test.Solution;

public class AddTwoNumbers {

    // Concepts:
    // Traverse a tree
    // Create a Linked list
    // Complex interactions between two lists
    // Two factor sum with Value and Rest

    // Cons:
    // Unrelated scenario to a real world case
    // Uncommon manual usage of the concepts/structure in production environments

    public static void printLinkedList(ListNode listNode) {
        ListNode currentNode = listNode;
        do {
            System.out.println(currentNode.val);
            currentNode = currentNode.next;
        } while (currentNode != null);
    }

    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        String[] strings = {};
        addTwoNumbers.run(strings);
    }

    public void run(String[] args) {
        Solution solution = new Solution();
        // n1(2,n2) -> n2(4,n3)-> n3(3,null)
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3, null)));
        // n1(2,n2) -> n2(4,n3)-> n3(3,null)
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4, null)));
        ListNode result = solution.addTwoNumbers(l1, l2);

        printLinkedList(result);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    //      [2,4,3]
    //      [5,6,4]
    //      [7,0,8]
    class Solution {
        //        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//
//            ListNode currentL1 = l1;
//            ListNode currentL2 = l2;
//            ListNode currentL3 = new ListNode(0);
//            ListNode l3 = currentL3;
//            int left = 0;
//
//            do {
//                int sum = currentL1.val + currentL2.val + left;
//                int right = sum > 9 ? sum - 10 : sum;
//                left = sum > 9 ? 1 : 0;
//
//                ListNode node = new ListNode(right);
//                currentL3.next = node;
//                currentL3 = currentL3.next;
//                //l3.next = currentL3;
//                //currentL3 = currentL3.next;
//                currentL1 = currentL1.next;
//                currentL2 = currentL2.next;
//
//            } while (currentL1 != null || currentL2 != null );
//
//            return l3;
//        }
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode head = new ListNode(-1);//creating a node in order to store the sum of digit in a List format
            ListNode temp = head;//we are using temp to add node to the new List

            int carry = 0;//we are storing the carry at every digit pair iteration

            while (l1 != null || l2 != null || carry > 0)//our loop terminating condtition, all the numbers will be added
            {
                int sum = 0;//to store the sum at every digit pair iteration

                if (l1 != null)//adding list one node to the local sum
                {
                    sum += l1.val;//adding to the sum
                    l1 = l1.next;//moving the l1 pointer to the next node
                }

                if (l2 != null) {
                    sum += l2.val;//adding to the sum
                    l2 = l2.next;//moving the l2 pointer to the next node
                }
                sum += carry;//adding the sum inclusive carry
                carry = sum / 10;//extracting the first digit
                ListNode node = new ListNode(sum % 10);//extracting the last digit and creating the node
                temp.next = node;//linking the node to the list

                temp = temp.next;//moving the temp
            }
            return head.next;//returning the new head of the new list
        }
    }
/*


  9,9,9,9,9,9,9
        9,9,9,9
1,0,0,0,9,9,9,8

8,9,9,9,0,0,0,1
*/

}
