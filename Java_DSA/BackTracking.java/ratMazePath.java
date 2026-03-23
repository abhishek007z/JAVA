public class ratMazePath {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];
        print(0,0, rows-1, cols-1," ", isVisited);
    }

    public static void print(int sRow, int sCol, int eRow, int eCol, String s, boolean[][] isVisited){
        if(sRow < 0 || sCol < 0) return;
        if(sRow > eRow || sCol > eCol) return;
        if(isVisited[sRow][sCol] == true) return;//very important condition
        if(sRow == eRow && sCol == eCol){
            System.out.println(s);
            return;
        }
        isVisited[sRow][sCol] = true;//for marking a check point

        //go right
        print(sRow, sCol+1, eRow, eCol, s+"R", isVisited);
        //go down
        print(sRow+1, sCol, eRow, eCol, s+"D", isVisited);
        //go left
        print(sRow, sCol-1, eRow, eCol, s+"L", isVisited);
        //go up
        print(sRow-1, sCol, eRow, eCol, s+"U", isVisited);
        //backtracking
        isVisited[sRow][sCol] = false;//aging making the points unvisited
    }
}
