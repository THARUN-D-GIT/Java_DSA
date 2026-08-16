package Stacks;

import java.util.Stack;

public class Min_Stack {

    // ========================= LC FUNCTION =========================

    static class MinStack {
        // Stack<Integer> st;
        // Stack<Integer> mst;

        // public MinStack() {
        //     st=new Stack<>();
        //     mst=new Stack<>();


        // }

        // public void push(int value) {
        //     if(mst.isEmpty() || value<=mst.peek())
        //     {
        //         st.push(value);
        //         mst.push(value);
        //     }
        //     else{
        //         st.push(value);
        //         mst.push(mst.peek());
        //     }

        // }

        // public void pop() {
        //     st.pop();
        //     mst.pop();

        // }

        // public int top() {
        //     return st.peek();

        // }

        // public int getMin() {
        //     return mst.peek();
        // }

        //METHOD 2
        //initilay if we use int it will give error for many test case make it long
        Stack<Long> st;
        long min=Long.MAX_VALUE;

        public MinStack() {
            st=new Stack<>();
        }

        public void push(int value) {
            if(st.size()==0) min=(long)value;

            if((long)value>=min) st.push((long)value);
            else{
                // st.push((2*value)-min); to avoid int overflow
                st.push((long)value+((long)value-min));
                min=(long)value;
            }

        }

        public void pop() {
            if(st.peek()>=min) st.pop();
            else{
                // min=(2*min)-st.peek();  to avoid integer overflow
                min=min+(min-st.peek());
                st.pop();
            }

        }

        public int top() {
            long a=st.peek();
            if(a<min) return(int) min;
            return (int)a;

        }

        public int getMin() {
            return (int) min;
        }
    }

    // ========================= MAIN FUNCTION =========================

    static void main(String[] args) {
        /*
        Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

MinStack() initializes the stack object.
void push(int value) pushes the element value onto the stack.
void pop() removes the element on the top of the stack.
int top() gets the top element of the stack.
int getMin() retrieves the minimum element in the stack.
You must implement a solution with O(1) time complexity for each function.



Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2


Constraints:

-231 <= val <= 231 - 1
Methods pop, top and getMin operations will always be called on non-empty stacks.
At most 3 * 104 calls will be made to push, pop, top, and getMin
         */

        MinStack obj = new MinStack();

        System.out.println("Input:");

        System.out.println("push(5)");
        obj.push(5);

        System.out.println("push(3)");
        obj.push(3);

        System.out.println("push(7)");
        obj.push(7);

        System.out.println("push(2)");
        obj.push(2);

        System.out.println("getMin()");
        System.out.println("Output: " + obj.getMin());

        System.out.println("top()");
        System.out.println("Output: " + obj.top());

        System.out.println("pop()");
        obj.pop();

        System.out.println("getMin()");
        System.out.println("Output: " + obj.getMin());

        System.out.println("top()");
        System.out.println("Output: " + obj.top());
    }
}