import java.util.*;
public class arraylist{
	public static void main(String[]args){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println(list);
		System.out.println(list.get(0));
		list.remove(2);
		System.out.println("after remove cat"+"\n"+list);
	}
}
