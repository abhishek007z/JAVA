package Arrays;

public class mergeSortArrys {
    public static void main(String[] args) {
        int[] a = {11,23,34,54,67,76};
        int[] b = {10,15,34,45,61,98};
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        //merging
        while(i < a.length && j < b.length){
            if(a[i] <= b[j]){
                c[k] = a[i];
                i++;
            }
            else{
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if(i == a.length){//now take elements from a only
            while( j < b.length){
                c[k] = b[j];
                j++;
                k++;
            }
        }
        if(i == b.length){//now take elements from b only
            while( j < a.length){
                c[k] = a[i];
                i++;
                k++;
            }
        }
        for(int ele : c){
            System.out.print(ele+" ");
        }
    }
}
