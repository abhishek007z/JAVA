// Important question

import java.util.Scanner;

public class MazePath {
    public static int maze(int row, int col, int m, int n){
        if(row == m || col == n) return 1;
        int right = maze(row, col+1, m, n);
        int left = maze(row+1, col, m, n);
        return right + left;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter m: ");
        int m = sc.nextInt();
        System.out.print(maze(1,1,m,n));
        sc.close();
    }
}
