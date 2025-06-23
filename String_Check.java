import java.util.*;

public class StringCheck {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        String s = user.next();
        String c = user.next();
        ArrayList<Character> list = new ArrayList<>();
        ArrayList<Character> list1 = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            list.add(ch);
        }
        for (char ch : c.toCharArray()) {
            list1.add(ch);
        }

        System.out.println("First list: " + list);
        System.out.println("Second list: " + list1);

        boolean containsAllChars = list1.containsAll(list);
        System.out.println("All characters present: " + containsAllChars);

        int index = 0;
        boolean found = true;

        for (int i = 0; i < list.size(); i++) {
            char currentChar = list.get(i);
            boolean charFound = false;
            while (index < list1.size()) {
                if (list1.get(index) == currentChar) {
                    charFound = true;
                    index++;
                    break;
                }
                index++;
            }
            if (!charFound) {
                found = false;
                break;
            }
        }

        System.out.println("Characters in order: " + found);
    }
}
