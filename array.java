import java.util.Scanner;
public class array{
	public static void main(String[]args){
		Scanner user=new Scanner(System.in);
		int n=user.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=user.nextInt();
		}
		for(int j=0;j<n;j++){
		
			System.out.print(" "+arr[j]);
		}
		user.close();
	}
}
