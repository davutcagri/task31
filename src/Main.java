import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Black");
        arr.add("White");
        arr.add("Red");
        arr.add("Blue");
        arr.add("Green");

        Iterator<String> iterator = arr.iterator();

        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}