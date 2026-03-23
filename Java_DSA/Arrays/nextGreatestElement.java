package Arrays;

public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr = {12,43,25,76,98,23,45};
        int n = arr.length;
        int nge = arr[n-1];
        int[] ans = new int[n];
        for(int i = n-2; i >= 0; i--){
            ans[i] = nge;
            nge= Math.max(nge,arr[i]);
        }
        for(int ele : ans){
            System.out.print(ele+" ");
        }
    }
}
