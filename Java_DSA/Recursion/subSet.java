import java.util.ArrayList;

public class subSet {
    static ArrayList<String> nums = new ArrayList<>();
    public static void print(int i, String s , String ans){
        if(i == s.length()){
            nums.add(ans);
            return;
        }
        char ch = s.charAt(i);
        print(i+1, s, ans+ ch);
        print(i+1, s, ans);
    }

    public static void main(String[] args) {
        String s = "abcd";
        nums = new ArrayList<>();
        print(0,s,"");
        System.out.println(nums);
    }
}
