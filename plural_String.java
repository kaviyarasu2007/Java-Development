import java.util.*;
public class Plural {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int size = user.nextInt();
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < size; i++) {
            list.add(user.next());
        }
        System.out.println(list);
        for (int j = list.size() - 1; j >= 0; j--) {
            if (!list.get(j).endsWith("s")) {
                list.remove(j);
            }
        }
        
        System.out.println("After removing singular: " + list);
    }
}
