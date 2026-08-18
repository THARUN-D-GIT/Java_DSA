package QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class TraversingOfQueue {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        print(q);
        add(q,2,69);
        print(q);
        System.out.println(peek(q,4));
        remove(q,3);
        print(q);
    }
    public static void print(Queue<Integer> q) {
        int size = q.size();
        for(int i=1;i<=size;i++)
        {
            int top=q.poll();
            System.out.print(top+" ");
            q.add(top);
        }
        System.out.println();
    }
    public static void add(Queue<Integer> q,int idx,int val)
    {
        int n=q.size();
        if(idx<0 || idx>=n){
            System.out.println("invalid index");
            return;
        }
        if(idx==n) q.add(val);
        for(int i=0;i<idx;i++)
        {
            q.add(q.poll());
        }
        q.add(val);
        for(int i=0;i<n-idx;i++)
        {
            q.add(q.poll());
        }
        System.out.println();
    }
    public static int peek(Queue<Integer> q,int idx)
    {
        int n=q.size();
        if(idx<0 || idx>=n) return -1;
        for(int i=0;i<idx;i++)
        {
            q.add(q.poll());
        }
        int ans=q.peek();
        for(int i=0;i<n-idx;i++)
        {
            q.add(q.poll());
        }
        return ans;
    }
    public static int remove(Queue<Integer> q,int idx)
    {
//        int n=q.size();
        for(int i=0;i<idx;i++)
        {
            q.add(q.poll());
        }
       int ans= q.remove();
        for(int i=0;i<q.size()-idx;i++)
        {
            q.add(q.poll());
        }
        return ans;
    }
}
