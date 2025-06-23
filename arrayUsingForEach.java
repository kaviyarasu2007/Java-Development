import java.util.Scanner;
public class foreach{
	public static void main(String[]args){
		Scanner user=new Scanner(System.in);
		int row,col;
		System.out.println("Enter the row:");
		row=user.nextInt();
		System.out.println("Enter the col:");
		col=user.nextInt();
		int arr[][]=new int [row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				arr[i][j]=user.nextInt();
			}
		}
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
