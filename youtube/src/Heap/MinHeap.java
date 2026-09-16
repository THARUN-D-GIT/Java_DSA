package Heap;
class Heap{
    int [] arr;

    int idx=1;
    int peek()
    {
        return arr[1];
    }
    Heap(int cap)
    {
        arr = new int[cap+1]; //we are not using 0th index
    }
    void add(int elem)
    {
        if(idx==arr.length) {
            System.out.println("Heap is full");
            return;
        }
        arr[idx++]=elem;
        //rearrangement
        int root=idx-1; //idx has been incremented
        // i because we don`t want to change idx
        while(root!=1)
        {
            int parent=root/2;
            if(arr[root]<arr[parent])
            {
               int temp=arr[root];
               arr[root]=arr[parent];
               arr[parent]=temp;
               root=parent; // root=root/2;
            }
            else break;
        }

    }
    int  remove(){
        int min=arr[1];
        if(idx==1) {
            System.out.println("heap is still empty");
            return -1;
        }
        arr[1]=arr[idx-1]; // idx is already incremented
        idx--;
        //Rearrangement
        int root=1;
        while(root<=size()) // use 2*root
        {
           int left=2*root;
           int right=2*root+1;
           int leftval=(left<=size()) ?arr[left]:Integer.MAX_VALUE;
            int rightval=(right<=size()) ?arr[right]:Integer.MAX_VALUE;
           if(arr[root]<=leftval && arr[root]<=rightval) break;
           else{
               if(leftval<rightval) {
                   //swap with left node
                   int temp=arr[root];
                   arr[root]=arr[left];
                   arr[left]=temp;
                   root=left;
               }
               else{
                   //swap with right node
                   int temp=arr[root];
                   arr[root]=arr[right];
                   arr[right]=temp;
                   root=right;
               }
           }

        }
        return min;

    }
    int size()
    {
        return idx-1;
    }
    void display()
    {
        for(int i=1;i<idx;i++) System.out.print(arr[i]+" ");
        System.out.println();
    }

}

public class MinHeap {
    static void main(String[] args) {
        Heap h=new Heap(7);
        h.add(10);h.add(15);h.add(8);h.add(9);h.add(4);
        h.display();
        h.add(3);
        h.display();
        System.out.println(h.remove());
        h.display();

    }
}
