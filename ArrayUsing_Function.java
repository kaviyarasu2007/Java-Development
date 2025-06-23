import java.util.Scanner;
class FirstClass{
    public int x;
    public int y;
}
public class Main{
    public static void main(String[]args){
        FirstClass x1 = new FirstClass();
        FirstClass x2 = new FirstClass();
        Scanner user = new Scanner(System.in);
        System.out.print("Enter an integer1: ");
        x1.x = user.nextInt();
        System.out.print("Enter a integer2: ");
        user.nextInt(); 
        x2.y = user.nextInt();
        System.out.println("\nValues entered:");
        System.out.println("Integer1: " + x1.x);
        System.out.println("Integer2: " + x2.y);
        user.close();
    }
}
