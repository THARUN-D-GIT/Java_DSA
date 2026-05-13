package ArrayLst_And_Vector;

import java.util.ArrayList;
import java.util.Collections;

public class AL_basic {
    static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(17);
        System.out.println(list);
        System.out.println(list.get(2));
        list.set(2,25);
        System.out.println(list);
        list.add(3,50);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

    }
}
