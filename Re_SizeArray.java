import java.util.*;
public class resize_array{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int arr[]=new int [5];
		int new_arr[]=new int [10];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
			new_arr[i]=arr[i];
		}
		for(int i=0;i<new_arr.length;i++){
			System.out.print(new_arr[i]+" ");
		}
		System.out.println();
		for(int i=5;i<new_arr.length;i++){
			new_arr[i]=sc.nextInt();
		}
		for(int i=0;i<new_arr.length;i++){
			System.out.print(new_arr[i]+" ");
		}
		sc.close();
	}
}
