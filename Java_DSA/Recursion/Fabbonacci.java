import java.util.Scanner;

public class Fabbonacci {
    public static int fabbo(int n){
        if(n <= 1) return n;
        return fabbo( n - 1) + fabbo(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fabbo(n));
        sc.close();
    }
}
