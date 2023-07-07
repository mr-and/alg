/**********************************************************************************
 *
 * You are given the heads of two sorted linked lists list1 and list2.
 *
 * Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
 *
 * Return the head of the merged linked list.
 *
 **********************************************************************************/


package problem18;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tempNode = new ListNode(0);
        ListNode currentNode = tempNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        if (list1 != null) {
            currentNode.next = list1;
            list1 = list1.next;
        }

        if (list2 != null) {
            currentNode.next = list2;
            list2 = list2.next;
        }

        return tempNode.next;


        /***
         //Approach: Using recursion

         //base case
         if(list1==null) return list2;
         if(list2==null) return list1;

         //check condition if value of list1 is less than value of list2,
         //than we recursively add whole list2 in to list1
         if(list1.val<list2.val){
         list1.next = mergeTwoLists(list1.next, list2);
         return list1;
         }
         else{
         list2.next = mergeTwoLists(list1, list2.next);
         return list2;
         }
         */
    }


    public static class ListNode {
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
}
