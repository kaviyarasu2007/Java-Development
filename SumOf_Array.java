import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        int row, col;
        System.out.println("Enter row");
        row = user.nextInt();
        System.out.println("Enter col");
        col = user.nextInt();
        
        int arr[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = user.nextInt();
            }
        }
        
        print(arr, row, col);
    }
    
    public static void print(int[][] arr, int row, int col) { 
        int result = 0;  
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                result += arr[i][j];
            }
        }
        System.out.println("Sum: " + result);
    }
}
