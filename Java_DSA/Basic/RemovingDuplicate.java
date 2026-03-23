

public class RemovingDuplicate {
    public static void main(String[] args) {
        int arr[] = {10,8,4,3,2,3,2,4,7};
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int dubElement = 0;
            for(int j = 0; j < i; j++){
                if(arr[i] == arr[j]){
                    dubElement = 1;
                }
            }
            for(int k = 0; k < 1; k++){
                if(dubElement == 0){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
