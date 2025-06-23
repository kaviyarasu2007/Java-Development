import java.util.*;
public class StringCheck_fn{
	public static boolean isSquence(String s,String t){
		ArrayList<Character> list_t=new ArrayList<>();
		for(int i=0;i<t.length();i++){
			char c = t.charAt(i);
			list_t.add(c);
		}
		int index=0;
		for(char c : s.toCharArray()){
			boolean found=false;
			while(index<list_t.size()){
				if(list_t.get(index)==c){
					found=true;
					index++;
					break;
				}
				index++;
			}
			if(!found) return false;
		}
		return true;
	}
	public static void main(String[]args){
		Scanner user=new Scanner(System.in);
		System.out.print("Enter the string one:");
		String s=user.next();
		System.out.print("Enter the string two:");
		String t=user.next();
		System.out.println("the string matching result: "+isSquence(s,t));
	}
}
