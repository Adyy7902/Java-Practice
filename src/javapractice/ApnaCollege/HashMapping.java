package javapractice.ApnaCollege;

import java.util.*;
/**
 *
 * @author V KUMAR
 */
public class HashMapping {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
    
        //Insert
        map.put("India", 130);
        map.put("China", 150);
        map.put("USA", 30);
        
        //System.out.println(map);
        
        //Update
        map.put("China", 180);
        //System.out.println(map);
        /*
        //Search
        if(map.containsKey("China")){
            System.out.println("Key present in the map!!");
        }else{
            System.out.println("Key not present in the map!!");
        }
        //to find the value of the given key:-
        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("Indonesia")); // key doesn't exist
        */
        
        /*
        //Iteration
        for(Map.Entry<String, Integer> e: map.entrySet()){
            System.out.print(e.getKey()+" ");
            System.out.print(e.getValue()+" ");
        }
        System.out.println("");
        
        Set<String> key = map.keySet();
        for(String keys : key){
            System.out.println(keys + " " + map.get(keys));
        }
        */
        
        //Remove
        map.remove("China");
        System.out.println(map);
    }
}
