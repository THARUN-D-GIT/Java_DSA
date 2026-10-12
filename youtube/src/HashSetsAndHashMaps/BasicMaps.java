package HashSetsAndHashMaps;
import java.util.*;
public class BasicMaps {
    static void main(String[] args) {
     HashMap<String,Integer> map = new HashMap<>();
     map.put("Tarun",100);
     map.put("Varun",108);
     map.put("Vishwas",114);
     map.put("yeshwanth",118);
        System.out.println(map+" "+map.size());
        //Map.remove always use key only
        //using value will not effect anything on maps
        System.out.println(map.remove(100));
        System.out.println(map+" "+map.size());
        //using key will actual remove the elements
        System.out.println(map.remove("Tarun"));
        System.out.println(map+" "+map.size());

        //Replacing the value will change the prev value
        //ex:tarun 100 if we change tarun 202 old will get replace
        map.put("Varun",221);
        System.out.println(map+" "+map.size());

        //getting value of a key
        System.out.println(map.get("Vishwas"));
        //Contains key
        System.out.println(map.containsKey("Tarun"));
        //in maps and sets we will only use for each loop to itterate
        //because we don`t have the concept of index in them
        //in maps we use key to traverse
        for(String key:map.keySet()){
            System.out.println(key+" "+map.get(key));
        }
        //key only key and map.get(key) gets it frequency also
        for(String key:map.keySet()){
            System.out.println(key);
        }

    }
}
