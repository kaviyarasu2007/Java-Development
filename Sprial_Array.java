import java.util.Scanner;
public class SpiralArrayPrint {
    public static void main(String[]args){
	    Scanner sc=new Scanner(System.in);
	    int row=sc.nextInt();
	    int col=sc.nextInt();
	    int [][]arr=new int [row][col];
	    for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
			    arr[i][j]=sc.nextInt();
		    }
	    }
	    print(arr,row,col);
	    spiraltraversal(arr);
    }
    public static void print(int [][]arr,int row,int col){
	    for(int i=0;i<row;i++){
		    for(int j=0;j<col;j++){
			    System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
	    }
    }
    public static void spiraltraversal(int [][]arr){
	    int top=0;
	    int bottom=arr.length-1;
	    int left=0;
	    int right=arr[0].length-1;
	    while(top<=bottom && left<=right){
		    for(int i=left;i<=right;i++){
			    System.out.print(arr[top][i]+" ");
		    }
		    top++;
		    for(int i=top;i<=bottom;i++){
			    System.out.print(arr[i][right]+" ");
		    }
		    right--;
		    for(int i=right;i>=left;i--){
			    System.out.print(arr[bottom][i]+" ");
		    }
		    bottom--;
		    for(int i=bottom;i>=top;i--){
			    System.out.print(arr[i][left]+" ");
		    }
		    left++;
	    }
    }
}
