// import java.util.Scanner;

// public class Prefix {
//     public static void main(String[] args) {
//         Scanner in = new Scanner(System.in);
//         System.out.println("Enter the number :");

//         for(int i=100; i<1000; i++){
//             if(isArmstrong(i)){
//                 System.out.print(i);
//             }
//         }
//     }

//     static boolean isArmstrong(int n){
//         int original = 0;
//         int sum = 0;
//         while(n>0){
//             int rem = n % 10;
//             n = n/10;
//             sum = sum + rem*rem*rem;
//         }

//         return sum == original;
//     }
// }





import java.util.Scanner;

public class Prefix {
    public boolean checkArmStrong(int number){
        int original = number;
        int sum = 0;
        int numlength = String.valueOf(original).length();

        for(int i = 0; i < numlength; i++){
            int digit = original % 10;
            sum += Math.pow(digit, numlength);
            original = original/10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Prefix armStrong = new Prefix();
        // int num = 153;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = in.nextInt();

        if(armStrong.checkArmStrong(num)){
            System.out.println(num+"is a ArmStrong Number");
        } else{
            System.out.println(num+"is not a ArmStrong Number");
        }
        in.close();
    }
}