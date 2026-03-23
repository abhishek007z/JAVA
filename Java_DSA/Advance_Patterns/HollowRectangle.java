package Advance_Patterns;

public class HollowRectangle {
    public static void hollow_rectangle(int totalRows, int totalColumn){
        //outer loop- rows
        for(int i = 1; i <= totalRows; i++){
            //inner loop- coloum boundry
            //coloum Cells(i,j)
            for(int j =1; j <= totalColumn; j++){
                //boundry conditions
                if(i == 1 || i == totalRows || j == 1 || j == totalColumn){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rectangle(4, 5);
    }
}
