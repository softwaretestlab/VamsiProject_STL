package JavaLearning;


import org.junit.Test;

import java.util.HashMap;

public class AT13_HashMap {
    @Test
    public void test16(){
        // here we created an object of Hashmap and this hashmap takes Stringer and Integer as Key:Value
        HashMap<String,Integer> map = new HashMap<>();
        map.put("Ricky",11);
        map.put("Bianca",8);
        map.put("Jasper",1);
        System.out.println("Data inside map is : "+ map);
        //count
        int mapSize=map.size();
        System.out.println("mapSize is : "+ mapSize);
        if(map.containsKey("Bianca")){
            int keyVal=map.get("Bianca");
            System.out.println("keyVal is : "+ keyVal);
        }
    }
}
