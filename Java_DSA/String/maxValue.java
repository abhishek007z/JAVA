package String;

public class maxValue {

    public static String maxS(String a, String b){
        String s = purify(a);
        String t = purify(b);
        if(s.length() > t.length()) return a;
        if(s.length() < t.length()) return b;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != t.charAt(i)){
                if(s.charAt(i) > t.charAt(i)) return a;
                else return b;
            }
        }
        return a;
    }

    public static String purify(String s){
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != '0')
                return s.substring(i);
        }
        return "0";
    }

    public static void main(String[] args) {
        String[] arr = {"123654", "123654789", "1236547890"};
        String max = arr[0];
        for(int i = 1; i < arr.length; i++){
            max = maxS(max, arr[i]);
        }
        System.out.println(max);
    }
}