import java.lang.reflect.Array;
import java.util.*;

public class Hm {
    public static void main(String[] args) {
//        HashMap<String, ArrayList<String>> map = new HashMap<>();
//
//        map.put("Ivan", Arrays.asList("123"));
//        map.put("Ivan", List.of("123"));
//
//        addPhone(map,"Ivan", "123");
//        addPhone(map,"Ivan", "234");
//        addPhone(map,"Ivan", "345");
//        addPhone(map,"Petr", "345");
//        addPhone(map,"Petr", "567");
//        addPhone(map,"Elena", "123");

        HashMap<String, String> map = new HashMap<>();
        map.merge("Ivan", "123", (o, n) -> o == null ? n : o + " " + n);
        System.out.println(map);

        ArrayList<String> list = new ArrayList<>();
        for (String s: map.keySet()) {
            list.add(s);
        }

        Collections.sort(list, (o1, o2) -> map.get(o1).split(" ").length - map.get(o2).split(" ").length);
        list.forEach(n -> System.out.println(n + " = " + Arrays.toString(map.get(n).split(" "))));

//        Collections.sort(list, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return map.get(o1).size() - map.get(o2).size();
//            }
//        });

//        list.forEach(n -> System.out.println(n + " = " + map.get(n).size()));
    }
    private static void addPhone(HashMap<String, ArrayList<String>> map, String name, String phone){
        map.putIfAbsent(name, new ArrayList<>());
        map.get(name).add(phone);
    }




}

