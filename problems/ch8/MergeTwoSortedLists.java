package problems.ch8;

public class MergeTwoSortedLists {
        public static void main(String[] args) {
            // Example usage:
            ListNode l1 = new ListNode(1);
            l1.next = new ListNode(2);
            l1.next.next = new ListNode(5);

            ListNode l2 = new ListNode(1);
            l2.next = new ListNode(3);
            l2.next.next = new ListNode(4);

            System.out.print("연결리스트 1: ");
            printList(l1);

            System.out.print("연결리스트 2: ");
            printList(l2);

            System.out.println();

            ListNode merged = mergeSortedLists(l1, l2);

            // Print the merged list
            while (merged != null) {
                System.out.print(merged.val + " ");
                merged = merged.next;
            }
        }

        static class ListNode {
            int val;
            ListNode next;

            ListNode(int val) {
                this.val = val;
            }
        }

        public static ListNode mergeSortedLists(ListNode list1, ListNode list2) {
            // Use the provided recursive function to merge two sorted lists
            return mergeTwoLists(list1, list2);
        }

        public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // Base cases
            if (list1 == null) return list2;
            if (list2 == null) return list1;

            // Compare values and recursively merge
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
            } else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
    }
