import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class HashMap1 {
    public static void main(String[]args){
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 1);
        hm.put("Nepal", 2);
        hm.put("Bhutan", 3);

        // System.out.println(hm);
        // System.out.println(hm.get("India"));
        // System.out.println(hm.size());
        // System.out.println(hm.containsKey("Bhutan"));
        // System.out.println(hm.remove("Nepal"));
        // System.out.println(hm.size());

        // Set<String> keys = hm.keySet();

        // for (String k : keys) {
        //     System.out.println("Key is " + k + " and value is " + hm.get(k));
        
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 1);
        lhm.put("Nepal", 2);
        lhm.put("Bhutan", 3);

        System.out.println(lhm);

        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 1);
        tm.put("Bhutan", 2);
        tm.put("Nepal",3);

        System.out.println(tm);

    }
}
