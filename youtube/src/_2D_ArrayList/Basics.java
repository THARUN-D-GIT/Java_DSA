package _2D_ArrayList;

import java.util.ArrayList;

public class Basics {
    static void main(String[] args) {
        /*
        we need to create arraylist such that it contains another arraylist
        arr={{1,2,3},{7,4,8,1},{4,5}}
        sout(arr.get(1).get(3)) ->1

        changing the values of 2nd aralist at 2nd index
        first access amd then change the value
        arr.get(1).set(2,10);

        adding element to last to an arraylist here fot 3rd arraylist
        first acces and then add element
        arr.get(2).add(3)

        adding new empty arralist
        arr.add(new ArrayList<>());

         */

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // u cant add numbers directly this we can add only arraylist so
        // we wiil create 1d arraylist 3 and then add the values to that
        ArrayList<Integer> a = new ArrayList<>();
        a.add(3);
        a.add(2);
        a.add(8);
        a.add(10);
        ArrayList<Integer> b = new ArrayList<>();
        b.add(5);
        b.add(7);
        b.add(9);
        b.add(11);
        ArrayList<Integer> c = new ArrayList<>();
        c.add(2);  c.add(6);  c.add(5);
        list.add(a);
        list.add(b);
        list.add(c);
       // System.out.println(list);
        // Method 2 using loop
        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(i).size();j++){
                System.out.print(list.get(i).get(j)+" ");
            }
            System.out.println();
        }
        System.out.println();
        for(ArrayList<Integer> list1:list ){
            for(Integer i:list1){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
