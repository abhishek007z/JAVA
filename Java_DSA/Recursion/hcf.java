import java.util.Scanner;

public class hcf {
    public static int gdf(int a, int b){
        if(b % a == 0){
            return a;
        }
        return gdf(b % a, a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
        int a = sc.nextInt();
        System.out.print("Enter b:");
        int b = sc.nextInt();
        System.out.println(gdf(a,b));
        sc.close();
    }
}
