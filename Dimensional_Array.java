import java.util.Scanner;
public class dimensional{
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
		for(int i=0;i<row;i++){
				System.out.print(arr[i][i]+" ");
		}
		System.out.println();
		for(int i=0;i<row;i++){
			System.out.print(arr[i][arr[i].length-1-i] +" ");
		}
		System.out.println("_______________________________________");
		for(int i=0;i<row;i++){
			        if(i%2==0){	
				      for(int j=0;j<col;j++){
					      System.out.print(arr[i][j]+" ");
				      }
				}
				else{
					for(int j=col-1;j>=0;j--){
						System.out.print(arr[i][j]+" ");
					}
				}
		}			
		user.close();

	}
}
