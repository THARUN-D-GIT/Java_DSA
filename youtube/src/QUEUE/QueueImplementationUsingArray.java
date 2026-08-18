package QUEUE;
class myQueue {
    int front;
    int rear;
    int [] arr;
    int size;
    myQueue(int len) {
        arr = new int[len];
    }
    void add(int val)
    {
        if (size == arr.length) {
            System.out.println("Overflow");
        }
//        arr[rear] = val;
//        rear++;

        arr[rear++] = val;
        if(rear == arr.length) rear = 0;
        size++;
    }
    int remove()
    {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        int ans=arr[front];
        front++;
        size--;
        if(front == arr.length) front = 0;
        return ans;
    }
    int peek()
    {
        if (size == 0) {
            System.out.println("Underflow");
            return -1;
        }
        return arr[front];
    }
    void print(){
        if(size == 0){
            System.out.println("Underflow");
            return;
        }
        if(front>=rear)
        {
            // front to end and then 0 to rear-1
            //front to end
            for(int i=front;i<=arr.length-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
            // 0 to rear-1
            for(int i=0;i<rear;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }
        else{
            for(int i=front;i<=rear-1;i++) {
                // or we can use i<rear
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

    }
//    int size()
//    {
//        if(size == 0){
//            System.out.println("Underflow");
//            return -1;
//        }
//        else return size;
//    }
}

public class QueueImplementationUsingArray {
    static void main(String[] args) {
        myQueue q = new myQueue(4);
            q.add(10); q.add(20); q.add(30);
            q.print();
        System.out.println(q.size);
            q.remove();
            q.print();
        System.out.println(q.size);
            q.add(40);
            q.add(50);
            q.print();
        System.out.println(q.size);
        q.add(60);



    }
}
