import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new Set();
        System.out.println(set1.add(555));
        System.out.println(set1.add(555));
        System.out.println(set1.add(123));
        System.out.println(set1.add(876));
        System.out.println(set1.add(333));
        System.out.println(set1.add(132));
        System.out.println(set1.add(443));
        System.out.println(set1.add(231));


        System.out.println(set1.remove(123));
        System.out.println(set1.remove(234));

        System.out.println(set1.add(777));
        System.out.println(set1.size());

        System.out.println(set1.isEmpty());

        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(set1.toStr());

    }
}
class Set<E>{
    private HashMap<E, Object> set = new HashMap<>();
    private static final Object VALL = new Object();
    public boolean add(E tel) {
        return set.put(tel, VALL) == null;
    }

    public boolean remove(E tel){
        return set.remove(tel) == VALL;
    }

    public int size() {
        return set.size();
    }

    public boolean isEmpty(){
       return set.isEmpty();
    }

    public Iterator<E> iterator(){
        return set.keySet().iterator();
    }

    public String toStr(){
        return set.keySet().toString().replace("[", "").replace("]", "");
    }
}