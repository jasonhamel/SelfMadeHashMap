import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        NewHashMap<String, Integer> nhm = new NewHashMap<>();
        HashMap<String, Integer> map = new HashMap<>();
        map.put("grapes", 1000);
        map.put("apples", 1000);
        map.put("berries", 1000);
        System.out.println(map.keySet());
        System.out.println(map.get("grapes"));
        nhm.put("grapes", 10000);
    }
}