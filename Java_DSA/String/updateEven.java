package String;

public class updateEven {
    public static void main(String[] args) {
        String s = "Radhika Sharma";
        int n = s.length();
        String t = "";
        for(int i = 0; i < n; i++){
            if(i % 2 == 0) t += 'a';
            else t += s.charAt(i);
        }
        System.out.println(t);
    }
}
