package Arrays;

public class DutchFlag {
    public static void swap(int[] arr, int mid, int low){
        int temp = arr[mid];
        arr[mid] = arr[low];
        arr[low] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,2,2,1,1,1,0,0,2,2,1};
        int n = arr.length;

        int low = 0;
        int height = n-1; 
        int mid = 0;
        while(mid <= height){
            if(arr[mid] == 0){
                swap(arr,low,mid);
                low++;
                mid++;
            }
            else if(arr[mid] == 1) mid++;
            else{ //arr[mid] == 2;
                swap(arr,mid,height);
                height--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
}
