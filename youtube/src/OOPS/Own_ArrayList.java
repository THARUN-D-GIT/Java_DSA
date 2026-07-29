package OOPS;

import java.util.ArrayList;

class Arraylist
{
    int [] arr=new int[10];
    int idx;
    int capacity;
    int size;
    Arraylist(int capacity){
        arr=new int[capacity];
    }
    int capacity(){
        return arr.length;
    }
    void add(int elem){
        if(idx==arr.length){
            int [] bigarr=new int[arr.length*2];
            for(int i=0;i<arr.length;i++){
                bigarr[i]=arr[i];
            }
            arr=bigarr; // arr is pointing to bigarr

        }
        arr[idx++]=elem;
    }
    void set(int index,int value)
    {
        arr[index]=value;
    }
    void display(){
//        for(int elem:arr)
//        {
//            System.out.print(elem+" ");
//        } for each loop unassigned values also
        for(int i=0;i<idx;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int get(int index){
        return arr[index];
    }
    void remove(int index){
        arr[index]=arr[index+1];
        idx--;

    }
    void insert(int index,int value){
        arr[index]=value;
    }

}

public class Own_ArrayList {
    static void main(String[] args) {
        Arraylist arr=new Arraylist(5);
        System.out.println(arr.capacity());
        arr.add(30);
        arr.add(40);
        arr.add(50);
        arr.add(60);
        arr.add(70); arr.add(80);
        arr.display();
        System.out.println(arr.get(3));
        arr.set(6,98);
        arr.display();
        arr.insert(3,35);
        arr.remove(4);

    }
}
