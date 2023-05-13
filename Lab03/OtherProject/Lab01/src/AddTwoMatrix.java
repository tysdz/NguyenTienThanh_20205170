import java.util.Scanner;

public class AddTwoMatrix {
    public AddTwoMatrix() {
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input number of rows of two matrices");
        int m = keyboard.nextInt();
        System.out.println("Input number of columns of two matrices");
        int n = keyboard.nextInt();
        int[][] array1 = new int[m][n];
        int[][] array2 = new int[m][n];
        int[][] sum = new int[m][n];
        System.out.println("Input elements of the first matrix");

        int i;
        int j;
        for(i = 0; i < m; ++i) {
            for(j = 0; j < n; ++j) {
                array1[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Input the elements of the second matrix");

        for(i = 0; i < m; ++i) {
            for(j = 0; j < n; ++j) {
                array2[i][j] = keyboard.nextInt();
                sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum of two matrices:");

        for(i = 0; i < m; ++i) {
            for(j = 0; j < n; ++j) {
                System.out.print(sum[i][j] + " ");
            }

            System.out.print("\n");
        }

    }
}

