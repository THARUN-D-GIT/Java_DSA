package Heap;
/*
===========================================================
                    HEAP - JAVA NOTES
===========================================================

1. WHAT IS A HEAP?
------------------
Heap is a Complete Binary Tree.

Complete Binary Tree:
- Every level is completely filled except possibly the last.
- Last level is filled from LEFT to RIGHT.

Heap is mainly used when we repeatedly need:
- Minimum element
- Maximum element
- Kth smallest/largest
- Top K elements
- Priority-based processing

In Java, we usually use:
        PriorityQueue


===========================================================
2. TYPES OF HEAP
===========================================================

A) MIN HEAP
-----------
Parent <= Children

Smallest element is always at ROOT.

Example:

            10
           /  \
         20    15
        / \    /
       30 40  25

Root = 10 (minimum)


B) MAX HEAP
-----------
Parent >= Children

Largest element is always at ROOT.

Example:

            50
           /  \
         40    30
        / \    /
       20 35  25

Root = 50 (maximum)


IMPORTANT:
Heap only guarantees the relationship between
PARENT and CHILD.

It does NOT mean:

        left < right

So don't confuse Heap with BST.


===========================================================
3. HEAP USING ARRAY
===========================================================

Heap can be stored efficiently using an array.

Example:

            10
           /  \
         20    15
        / \    /
       30 40  25

Array:

[10, 20, 15, 30, 40, 25]

Index:

 index:  0   1   2   3   4   5
 value: 10  20  15  30  40  25


For an element at index i:

Parent:
        (i - 1) / 2

Left Child:
        2 * i + 1

Right Child:
        2 * i + 2

Example:

i = 1
value = 20

left  = 2*1 + 1 = 3  -> 30
right = 2*1 + 2 = 4  -> 40


===========================================================
4. IMPORTANT HEAP OPERATIONS
===========================================================

Operation              Time Complexity

Peek Min/Max             O(1)
Insert                   O(log n)
Delete Root              O(log n)
Build Heap               O(n)
Search                   O(n)


Why is Peek O(1)?
-----------------
Because minimum/maximum is always at ROOT.


===========================================================
5. INSERT INTO HEAP
===========================================================

When inserting:

STEP 1:
Put the new element at the next empty position.

STEP 2:
Compare it with its parent.

STEP 3:
If heap property is violated, SWAP.

STEP 4:
Continue moving upward until heap property is restored.

This is called:

        HEAPIFY UP
        or
        SIFT UP


Example Min Heap:

            10
           /  \
         20    15

Insert 5:

            10
           /  \
         20    15
        /
       5

5 < 20 -> SWAP

            10
           /  \
          5    15
         /
        20

5 < 10 -> SWAP

             5
           /   \
         10     15
        /
       20

Heap restored.


===========================================================
6. DELETE ROOT FROM HEAP
===========================================================

Usually we delete the ROOT.

For Min Heap:
    Delete minimum

For Max Heap:
    Delete maximum


Steps:

STEP 1:
Remove the root.

STEP 2:
Take the LAST element.

STEP 3:
Put last element at ROOT.

STEP 4:
Compare it with children.

STEP 5:
Swap with the appropriate child if required.

STEP 6:
Continue downward.

This is called:

        HEAPIFY DOWN
        or
        SIFT DOWN


Example:

            5
           / \
         10   15
        / \
       20  30

Delete 5.

Take last element = 30

            30
           /  \
         10    15
        /
       20

30 > 10 -> swap

            10
           /  \
         30    15
        /
       20

30 > 20 -> swap

            10
           /  \
         20    15
        /
       30

Heap restored.


===========================================================
7. JAVA PRIORITYQUEUE
===========================================================

Java provides PriorityQueue which internally uses
a heap.

By default:

        PriorityQueue = MIN HEAP


Example:

PriorityQueue<Integer> pq = new PriorityQueue<>();

pq.add(30);
pq.add(10);
pq.add(20);
pq.add(5);

pq.peek();

Output:
5

Because 5 is the smallest element.


===========================================================
8. IMPORTANT PRIORITYQUEUE METHODS
===========================================================

add(x)
------
Adds element.

pq.add(10);


offer(x)
--------
Also adds element.

pq.offer(10);


peek()
------
Returns root WITHOUT removing it.

pq.peek();


poll()
------
Returns root AND removes it.

pq.poll();


size()
------
Returns number of elements.

pq.size();


isEmpty()
---------
Checks whether heap is empty.

pq.isEmpty();


clear()
-------
Removes all elements.

pq.clear();


IMPORTANT DIFFERENCE:

peek() -> only SEE root
poll() -> REMOVE root


===========================================================
9. MAX HEAP IN JAVA
===========================================================

PriorityQueue is MIN HEAP by default.

For MAX HEAP:

PriorityQueue<Integer> pq =
        new PriorityQueue<>(Collections.reverseOrder());


Example:

PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());

maxHeap.add(10);
maxHeap.add(50);
maxHeap.add(20);
maxHeap.add(30);

maxHeap.peek();

Output:
50


===========================================================
10. MIN HEAP vs MAX HEAP
===========================================================

MIN HEAP:

Smallest -> ROOT

Java:

PriorityQueue<Integer> pq =
        new PriorityQueue<>();


MAX HEAP:

Largest -> ROOT

Java:

PriorityQueue<Integer> pq =
        new PriorityQueue<>(Collections.reverseOrder());


Easy way to remember:

MIN HEAP -> minimum comes first
MAX HEAP -> maximum comes first


===========================================================
11. HEAP vs BST
===========================================================

HEAP:

Only parent-child relationship matters.

Min Heap:

        parent <= children


BST:

        left < root < right


Example BST:

            10
           /  \
          5    20

BST maintains ordering throughout the tree.

Heap does NOT maintain complete sorted ordering.


===========================================================
12. WHEN TO THINK ABOUT HEAP?
===========================================================

If the question contains:

"Kth largest"
"Kth smallest"
"Top K"
"K closest"
"Minimum"
"Maximum"
"Priority"
"Next smallest"
"Next largest"
"Merge K sorted"
"Running median"

Think:

        HEAP / PRIORITY QUEUE


===========================================================
13. VERY IMPORTANT KTH PATTERN
===========================================================

KTH LARGEST
-----------

Use MIN HEAP of size K.

Why?

Keep only K largest elements.

The smallest among those K elements stays at root.

That root becomes the Kth largest.


KTH SMALLEST
------------

Use MAX HEAP of size K.

Keep only K smallest elements.

The largest among those K elements stays at root.

That root becomes the Kth smallest.


Remember:

Kth Largest  -> MIN HEAP
Kth Smallest -> MAX HEAP


===========================================================
14. HEAP SORT
===========================================================

Heap can also be used for sorting.

General idea:

1. Build Heap
2. Take root
3. Move root to correct position
4. Heapify
5. Repeat

Time:

        O(n log n)

Standard in-place Heap Sort:

        O(1) extra space


===========================================================
15. QUICK MEMORY TRICK
===========================================================

MIN HEAP
--------
Minimum at TOP.

        MIN -> ROOT


MAX HEAP
--------
Maximum at TOP.

        MAX -> ROOT


INSERT
------
New element goes at bottom
        ↓
Compare with parent
        ↓
Move UP

        HEAPIFY UP


DELETE ROOT
-----------
Last element comes to root
        ↓
Compare with children
        ↓
Move DOWN

        HEAPIFY DOWN


===========================================================
16. JAVA TEMPLATE
===========================================================

import java.util.*;

MIN HEAP:

PriorityQueue<Integer> minHeap = new PriorityQueue<>();


MAX HEAP:

PriorityQueue<Integer> maxHeap =
        new PriorityQueue<>(Collections.reverseOrder());


Insert:

minHeap.add(10);


See minimum:

minHeap.peek();


Remove minimum:

minHeap.poll();


===========================================================
17. MOST IMPORTANT THINGS TO REMEMBER
===========================================================

1. Heap is a Complete Binary Tree.

2. Min Heap:
       smallest at root.

3. Max Heap:
       largest at root.

4. Java PriorityQueue is MIN HEAP by default.

5. Max Heap:
       Collections.reverseOrder()

6. peek() -> see root.

7. poll() -> remove root.

8. Insert -> O(log n)

9. Delete root -> O(log n)

10. Peek -> O(1)

11. Kth Largest -> Min Heap of size K.

12. Kth Smallest -> Max Heap of size K.

13. Heap != BST.

14. Insert uses HEAPIFY UP.

15. Delete root uses HEAPIFY DOWN.


===========================================================
                    END OF HEAP NOTES
===========================================================
*/
import java.util.*;
public class Basics {
    static void main(String[] args) {

        PriorityQueue<Integer> pq=new PriorityQueue<>();
//        pq.add(10); pq.add(20); pq.add(30);
//        System.out.println(pq.peek());
//        pq.add(40); pq.add(50);
//        System.out.println(pq.peek());
//        System.out.println("constructed tree:");
//        System.out.println(pq);
//        pq.add(-30);
//        System.out.println(pq.peek());
//        System.out.println("constructed tree:");
//        System.out.println(pq);
//        //we can use iterative method to print elem
//        for(int elem:pq)
//        {
//            System.out.print(elem+" ");
//        }
//        System.out.println();
//        System.out.println(pq.remove());
        pq.add(10); pq.add(20); pq.add(-30); pq.add(35); pq.remove();
        pq.add(5); pq.add(8); pq.add(2); pq.add(0); pq.add(3);
       pq.add(7); pq.add(6);
        System.out.println(pq);
    }
}
