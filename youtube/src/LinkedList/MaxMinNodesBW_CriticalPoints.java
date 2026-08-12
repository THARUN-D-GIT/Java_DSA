package LinkedList;

public class MaxMinNodesBW_CriticalPoints {

    public static void main(String[] args) {

        /*
         * LeetCode 2058 - Find the Minimum and Maximum Number
         * of Nodes Between Critical Points
         *
         *
         * Example:
         *
         * BEFORE:
         *
         * 5 -> 3 -> 1 -> 2 -> 5 -> 1 -> 2
         *
         *
         * Critical Points:
         *
         *       ↓
         * 5 -> 3 -> 1 -> 2 -> 5 -> 1 -> 2
         *           ↑         ↑
         *
         * Critical points = 1, 2, 5
         *
         *
         * Distances:
         *
         * Between 1 and 2 = 1
         * Between 2 and 5 = 3
         * Between 1 and 5 = 4
         *
         *
         * Minimum distance = 1
         * Maximum distance = 4
         *
         * Output:
         * [1, 4]
         */


        // Creating Linked List
        ListNode head = new ListNode(5);
        head.next = new ListNode(3);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(2);


        // Display input
        System.out.println("BEFORE:");
        display(head);


        // Find minimum and maximum distance
        int[] ans = nodesBetweenCriticalPoints(head);


        // Display result
        System.out.println("\nAFTER:");
        System.out.println("Minimum distance = " + ans[0]);
        System.out.println("Maximum distance = " + ans[1]);
    }


    // Display Linked List
    public static void display(ListNode head) {

        ListNode temp = head;

        while (temp != null) {

            System.out.print(temp.val);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }


    // Find minimum and maximum distance between critical points
    public static int[] nodesBetweenCriticalPoints(ListNode head) {

        int idx = 1;

        int fidx = -1;
        int lidx = -1;

        int min = Integer.MAX_VALUE;

        int[] ans = {-1, -1};


        // Minimum length is 2
        ListNode a = head;
        ListNode b = head.next;
        ListNode c = head.next.next;

        if (c == null)
            return ans;


        while (c != null) {

            // Check whether b is a critical point
            if ((b.val < a.val && b.val < c.val) ||
                    (b.val > a.val && b.val > c.val)) {

                // First critical point
                if (fidx == -1) {
                    fidx = idx;
                }

                // Calculate minimum distance
                if (lidx != -1) {

                    int dist = idx - lidx;

                    min = Math.min(dist, min);
                }

                // Update last critical point
                lidx = idx;
            }


            a = a.next;
            b = b.next;
            c = c.next;

            idx++;
        }


        // Maximum distance
        int max = lidx - fidx;


        // Only one critical point
        if (max == 0)
            max = -1;


        // No two critical points
        if (min == Integer.MAX_VALUE)
            min = -1;


        ans[0] = min;
        ans[1] = max;

        return ans;
    }
}