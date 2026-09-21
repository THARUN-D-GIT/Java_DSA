package HashSetsAndHashMaps;
import java.util.*;

public class Basics {
    //basics of hashsets
    static void main(String[] args) {
        //Hashset contains unique copy of every element
        /*
        No value will be present twice and if we add also it will be no
        problem but it will not be counted or contribute to size of hashset

        elements can be ordered in any way that us depending on hashcode


         */
        HashSet<Integer> hs = new HashSet<>();
        hs.add(77); hs.add(36);hs.add(67);hs.add(89);
        //print size
        System.out.println(hs.size());
        System.out.println(hs);
        //to check if any number exist or not
        System.out.println(hs.contains(27));
        System.out.println(hs.contains(36));
        hs.remove(36);
        System.out.println(hs.contains(36));
        System.out.println(hs.size());
        //now adding duplicate value to check size
        hs.add(77);
        System.out.println(hs.size());
        System.out.println(hs);


    }
}
