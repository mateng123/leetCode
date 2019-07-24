
public class GameOfLife_289 {

//    public void gameOfLife(int[][] board) {
//        int length = board.length;
//        int hight = board[0].length;
//        int[][] notChange = board;
//        for(int i=0;i<length;i++){
//            for(int j=0;j<hight;j++){
//                count(notChange,board,i,j);
//            }
//        }
//    }
//
//    public void count(int[][] notChange,int[][] board,int i,int j){
//        int x = liveOrDied(notChange,i-1,j)+liveOrDied(notChange,i,j-1)+
//                liveOrDied(notChange,i+1,j)+liveOrDied(notChange,i,j+1)
//                + liveOrDied(notChange,i-1,j-1)+liveOrDied(notChange,i-1,j+1)
//                +liveOrDied(notChange,i+1,j+1)+liveOrDied(notChange,i+1,j-1);
//
//        if(notChange[i][j]==1&&x<2){
//            board[i][j]=0;
//        }else if(notChange[i][j]==1&&x>=2&&x<=3){
//            board[i][j]=1;
//        }else if(notChange[i][j]==1&&x>3){
//            board[i][j]=0;
//        }else if(notChange[i][j]==0&&x==3){
//            board[i][j]=1;
//        }
//
//    }
//    public int liveOrDied(int[][] notChange,int i,int j){
//        int length = notChange.length;
//        int hight = notChange[0].length;
//        if(i<0||i>=length||j<0||j>=hight){
//            return 0;
//        }
//        return notChange[i][j];
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
//        new GameOfLife_289().gameOfLife(arr);
//    }
}
