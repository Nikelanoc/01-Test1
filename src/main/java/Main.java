import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;

public class Main {
    public static void main(String[] args) {
        Multiset<Integer>set = HashMultiset.create();
        set.add(6);
        set.add(6);
        set.add(5);
        System.out.println(set.contains(6));
        System.out.println(set.contains(4));
        System.out.println(set.count(5));
    }
}