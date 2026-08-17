import java.util.HashMap;

public class HashMapIntro {
    public static void main(String[] args){
        HashMap<String,String> map=new HashMap<>();
        map.put("name","semmozhiyan");
        map.put("address", "textool nagar");
        map.put("house no", "40A");
        map.put("area", "saravanampatti");
        System.out.println("original map: " +map);

        //put(key , updated_value)-> update element in hashmap
        map.put("house no", "50A");
        System.out.println("Area: "+map.get("area"));
        //containsKey->to check key is exist on the map
        System.out.println("district contains?" +map.containsKey("district"));
       //containsValue-> to check value is exist on the map 
        System.out.println("semmozhiyan contains? "+map.containsValue("semmozhiyan"));
        //find the size of the map
        System.out.println("size: "+map.size());
        //remove any element using key
        map.remove("area");
        for(HashMap.Entry<String,String> dataset : map.entrySet()){
            String key=dataset.getKey();
            String value=dataset.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
    
    
    
    
    }
    }

