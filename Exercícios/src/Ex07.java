package Arrays;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("L: ");
        int i = input.nextInt();
        System.out.print("C: ");
        int j = input.nextInt();

        int[][] matrix = new int[i][j];

        for(int x = 0; x < i; x ++){
            for(int y = 0; y < j; y ++){
                System.out.printf("Elemento [%d][%d]: ", x, y);
                matrix[x][y] = input.nextInt();
            }
        }
        System.out.print("\n");

        for(int x = 0; x < i; x ++) {
            for (int y = 0; y < j; y++) {
                System.out.printf("[%d]", matrix[x][y]);
            }
            System.out.print("\n");
        }

        System.out.print("N: ");
        int num = input.nextInt();
        for(int x = 0; x < i; x ++) {
            for (int y = 0; y < j; y++) {
                if(matrix[x][y] == num){
                    System.out.printf("\nPos: [%d][%d]", x, y);
                    if(x != 0) {
                        System.out.printf("\nUp: %d", matrix[x -1][y]);
                    }
                    if(x != i - 1){
                        System.out.printf("\nDown: %d", matrix[x + 1][y]);
                    }
                    if(y != 0) {
                        System.out.printf("\nLeft: %d", matrix[x][y - 1]);
                    }
                    if(y != j - 1) {
                        System.out.printf("\nRight: %d", matrix[x][y + 1]);
                    }
                }
            }
        }
    }
}
