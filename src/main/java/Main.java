import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashSetNew<Integer> set1 = new HashSetNew<>();

        System.out.println("Add: ");
        System.out.println(set1.add(555));
        System.out.println(set1.add(555));
        System.out.println(set1.add(123));
        System.out.println(set1.add(876));
        System.out.println(set1.add(333));
        System.out.println(set1.add(132));
        System.out.println(set1.add(443));
        System.out.println(set1.add(231));
        System.out.println("=".repeat(20));

        System.out.println("Remove: ");
        System.out.println(set1.remove(123));
        System.out.println(set1.remove(234));
        System.out.println("=".repeat(20));

        System.out.println("Size: ");
        System.out.println(set1.add(777));
        System.out.println(set1.size());
        System.out.println("=".repeat(20));

        System.out.println("Is Empty: ");
        System.out.println(set1.isEmpty());
        System.out.println("=".repeat(20));

        System.out.println("Iterator и вывод всех элементов: ");
        Iterator<Integer> it = set1.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("=".repeat(20));

        System.out.println("To String:");
        System.out.println(set1.toStr());
    }
}
class HashSetNew<E>{
    private HashMap<E, Object> hashSet = new HashMap<>();
    private static final Object VALL = new Object();
    public boolean add(E tel) {
        return hashSet.put(tel, VALL) == null;
    }

    public boolean remove(E tel){
        return hashSet.remove(tel) == VALL;
    }

    public int size() {
        return hashSet.size();
    }

    public boolean isEmpty(){
       return hashSet.isEmpty();
    }

    public Iterator<E> iterator(){
        return hashSet.keySet().iterator();
    }

    public String toStr(){
        return hashSet.keySet().toString().replace("[", "").replace("]", "");
    }
}