package Heap;

import java.util.*;

class MedianOfDataStream {

    /*
    Method-1
    this will give TLE error

    class MedianFinder {
        ArrayList<Integer> arr;

        public MedianFinder() {
            arr = new ArrayList<>();
        }

        public void addNum(int num) {
            arr.add(num);
        }

        public double findMedian() {
            Collections.sort(arr);
            int n = arr.size();

            if(n % 2 == 1)
                return arr.get(n / 2);
            else
                return (arr.get(n / 2) + arr.get(n / 2 - 1)) / 2.0;

            // 2.0 converts automatically to double
        }
    }
    */

    // Method-2 : Using Two Heaps
    static class MedianFinder {

        PriorityQueue<Integer> min;
        PriorityQueue<Integer> max;

        public MedianFinder() {
            min = new PriorityQueue<>();
            max = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {

            if(max.size() == 0)
                max.add(num);
            else {
                if(num < max.peek())
                    max.add(num);
                else
                    min.add(num);
            }

            // for size comparison
            if(max.size() == min.size() + 2) {
                min.add(max.poll());
            }

            if(min.size() == max.size() + 2) {
                max.add(min.poll());
            }
        }

        public double findMedian() {

            if(max.size() == min.size() + 1)
                return max.peek();

            else if(min.size() == max.size() + 1)
                return min.peek();

            else
                return (max.peek() + min.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {
        /*
        LC-295
        The median is the middle value in an ordered integer list. If the size of the list is even, there is no middle value, and the median is the mean of the two middle values.

For example, for arr = [2,3,4], the median is 3.
For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
Implement the MedianFinder class:

MedianFinder() initializes the MedianFinder object.
void addNum(int num) adds the integer num from the data stream to the data structure.
double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.


Example 1:

Input
["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
[[], [1], [2], [], [3], []]
Output
[null, null, null, 1.5, null, 2.0]

Explanation
MedianFinder medianFinder = new MedianFinder();
medianFinder.addNum(1);    // arr = [1]
medianFinder.addNum(2);    // arr = [1, 2]
medianFinder.findMedian(); // return 1.5 (i.e., (1 + 2) / 2)
medianFinder.addNum(3);    // arr[1, 2, 3]
medianFinder.findMedian(); // return 2.0


Constraints:

-105 <= num <= 105
There will be at least one element in the data structure before calling findMedian.
At most 5 * 104 calls will be made to addNum and findMedian.


Follow up:

If all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
If 99% of all integer numbers from the stream are in the range [0, 100], how would you optimize your solution?
         */

        MedianFinder obj = new MedianFinder();

        System.out.println("Adding: 1");
        obj.addNum(1);
        System.out.println("Median: " + obj.findMedian());

        System.out.println("\nAdding: 2");
        obj.addNum(2);
        System.out.println("Median: " + obj.findMedian());

        System.out.println("\nAdding: 3");
        obj.addNum(3);
        System.out.println("Median: " + obj.findMedian());

        System.out.println("\nAdding: 4");
        obj.addNum(4);
        System.out.println("Median: " + obj.findMedian());

        System.out.println("\nAdding: 5");
        obj.addNum(5);
        System.out.println("Median: " + obj.findMedian());

        System.out.println("\nAdding: 6");
        obj.addNum(6);
        System.out.println("Median: " + obj.findMedian());
    }
}
