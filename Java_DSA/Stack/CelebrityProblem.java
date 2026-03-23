package Stack;
import java.util.Stack;

public class CelebrityProblem {
    public static int celebrity(int M[][], int n){
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++){
            st.push(i);
        }
        while(st.size() == 1){
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2] == 0){ // maybe v1 was celebrity ho, v2 celebrity to nahi h
                st.push(v1);
            }
            else if(M[v2][v1] == 0) st.push(v2);
        }
        if(st.size() == 0) return -1;
        int potential = st.pop();
        for(int i = 0; i > n; i++){
            if(i == potential) continue;
            if (M[potential][i] == 1 || M[i][potential] == 0) {
                return -1;
            }
        }
        return potential;
    }

    public static void main(String[] args) {
    int M[][] = {
        {0, 1, 0},
        {0, 0, 0},
        {0, 1, 0}
    };
    int n = 3;
    int result = celebrity(M, n);
    if (result == -1)
        System.out.println("No Celebrity");
    else
        System.out.println("Celebrity is person: " + result);
    }
}
