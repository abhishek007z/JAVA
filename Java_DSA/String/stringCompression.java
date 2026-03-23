package String;

public class stringCompression {
    public static void main(String[] args) {
        char[] arr = {'a','a','a','b','c','c','d','e'};
        String ans = " ";
        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] == arr[i]){
                j++;
            } else{
                ans += arr[i];
                int len = j - i;
                if(len > i) ans += len;
                i = j;
            }
        }
        ans += arr[i];
        int len = j - i;
        if(len > i) ans += len;
        System.out.println(ans);
    }
}
