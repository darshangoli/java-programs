import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class SortSet{
    public Set<String> sortSet(Set<String> set){
        
        return set;
    }
    public static void main(String[] args) {
        SortSet obj = new SortSet();
        Set<String> set = new TreeSet<>();
        set.add("banana");
        set.add("apple");
        set.add("pineapple");
        set.add("guava");
        set.add("banana");
        System.out.println(obj.sortSet(set));
    }
}
