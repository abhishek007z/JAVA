//optimized code for rat maze question in backtracking in all 4 direction:
public class ratInDeadBlock {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;
        int[][] maze = {
            {1,0,1,1},
            {1,1,1,1},
            {1,1,0,1}
        };
        print(0, 0, rows-1, cols-1, " ", maze);
    }

    public static void print(int sr, int sc, int er, int ec, String s, int[][] maze){
        if(sr < 0 || sc < 0) return;
        if(sr > er || sc >ec) return;
        if(sr == er && sc == ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc] == 0) return;//means the path is blocked
        if(maze[sr][sc] == -1) return; //this means the point was already visited
        maze[sr][sc] = -1; //checking the path is visted or not
        //go right
        print(sr, sc+1, er, ec, s+"R", maze);
        //go down
        print(sr+1, sc, er, ec, s+"D", maze);
        //go left
        print(sr, sc-1, er, ec, s+"L", maze);
        //go up
        print(sr-1, sc, er, ec, s+"U", maze);
        //backtracking
        maze[sr][sc] = 1;//aging making the points unvisited
    }
}
