import java.util.ArrayList;
import java.util.List;

public class TestaList {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Felipe");
        lista.add("Carol");
        lista.add("Bernardo");
        for (String item : lista){
            System.out.println("Item: " + item);
        }

        lista.remove(1);

        for (int i = 0; i < lista.size(); i++){
            String item = lista.get(i);
            System.out.println("Item: " + item);
        }
    }
}
