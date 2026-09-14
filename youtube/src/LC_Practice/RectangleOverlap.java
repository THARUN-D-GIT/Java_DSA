package LC_Practice;

public class RectangleOverlap {
    static void main(String[] args) {
    /*
    LC-836
    POTD -14-SEP-2026
    An axis-aligned rectangle is represented as a list [x1, y1, x2, y2], where (x1, y1) is the coordinate of its bottom-left corner, and (x2, y2) is the coordinate of its top-right corner. Its top and bottom edges are parallel to the X-axis, and its left and right edges are parallel to the Y-axis.

Two rectangles overlap if the area of their intersection is positive. To be clear, two rectangles that only touch at the corner or edges do not overlap.

Given two axis-aligned rectangles rec1 and rec2, return true if they overlap, otherwise return false.



Example 1:

Input: rec1 = [0,0,2,2], rec2 = [1,1,3,3]
Output: true
Example 2:

Input: rec1 = [0,0,1,1], rec2 = [1,0,2,1]
Output: false
Example 3:

Input: rec1 = [0,0,1,1], rec2 = [2,2,3,3]
Output: false


Constraints:

rec1.length == 4
rec2.length == 4
-109 <= rec1[i], rec2[i] <= 109
rec1 and rec2 represent a valid rectangle with a non-zero area.
     */
        int[] rec1 = {0, 0, 2, 2};
        int[] rec2 = {1, 1, 3, 3};

        System.out.println("Example 1: " + isRectangleOverlap(rec1, rec2));


        int[] rec3 = {0, 0, 1, 1};
        int[] rec4 = {1, 0, 2, 1};

        System.out.println("Example 2: " + isRectangleOverlap(rec3, rec4));


        int[] rec5 = {0, 0, 1, 1};
        int[] rec6 = {2, 2, 3, 3};

        System.out.println("Example 3: " + isRectangleOverlap(rec5, rec6));


        int[] rec7 = {0, 0, 3, 3};
        int[] rec8 = {1, 1, 2, 2};

        System.out.println("Example 4: " + isRectangleOverlap(rec7, rec8));


        int[] rec9 = {0, 0, 4, 4};
        int[] rec10 = {2, 0, 6, 2};

        System.out.println("Example 5: " + isRectangleOverlap(rec9, rec10));
    }
    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
      /*  rec1[0] < rec2[2]   // rec1 left is before rec2 right
AND
rec2[0] < rec1[2]   // rec2 left is before rec1 right
rec1[1] < rec2[3]
AND
rec2[1] < rec1[3]
*/
        return  (rec1[0]<rec2[2] &&rec2[0] < rec1[2]) && (rec1[1] < rec2[3] && rec2[1] < rec1[3]);
    }
}
