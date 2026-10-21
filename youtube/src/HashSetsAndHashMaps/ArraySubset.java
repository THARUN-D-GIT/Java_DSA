package HashSetsAndHashMaps;

import java.util.HashMap;

public class ArraySubset {
    static void main(String[] args) {
        int [] a1={11,7,1,13,21,3,7,3};
        int [] b1={11,3,7,1,7};
        int [] a2={1,2,3,4,4,5,6};
        int [] b2={1,2,4};
        int [] a3={10,5,2,23,19};
        int [] b3={3,5,19};
        int [] a4={11,1,13,21,3,7,3};
        int [] b4={11,3,7,1,7};
        System.out.println("checking whether b sets is subset of a ");
        System.out.println("a1 is subset of b1 ?:"+isSubset(a1,b1));
        System.out.println("a2 is subset of b2 ?:"+isSubset(a2,b2));
        System.out.println("a3 is subset of b3 ?:"+isSubset(a3,b3));
        System.out.println("a4 is subset of b4 ?:"+isSubset(a4,b4));
        //every set is a subset of itself
        System.out.println("b1 is subset of b1 ?:"+isSubset(b1,b1));
    }
    public static boolean isSubset(int [] a,int [] b)
    {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        HashMap<Integer,Integer> map2 = new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map1.containsKey(a[i])){
                int freq=map1.get(a[i]);
                map1.put(a[i],freq+1);

            }
            else{
                map1.put(a[i],1);
            }
        }
        for(int elem:b)
        {
            if(!map1.containsKey(elem)) return false;
            if(map2.containsKey(elem)){
                map2.put(elem,map2.get(elem)+1);
            }
            else map2.put(elem,1);
        }
        for(int map:map2.keySet())
        {
            int freq=map2.get(map);
            int freq1=map1.get(map);
            if(freq1<freq) return false;

        }
        return true;
    }
}
