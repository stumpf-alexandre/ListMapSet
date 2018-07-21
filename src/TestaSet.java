import java.util.HashSet;
import java.util.Set;

public class TestaSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("João");
        set.add("Maria");
        set.add("Manuel");
        set.add("João"); //repetido não acrecenta

        for (String item : set){
            System.out.println("Item: " + item);
        }

        set.remove("Manuel");

        for (String item : set){
            System.out.println("Item: " + item);
        }
    }
}
