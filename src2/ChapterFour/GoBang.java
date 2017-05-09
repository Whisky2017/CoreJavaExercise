package ChapterFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 世康 on 2016/9/29.
 */
public class GoBang {
    private static int BOARD_SIZE = 15;
    private String[][] board;
    public void initBoard(){
        board = new String[BOARD_SIZE][BOARD_SIZE];
        for(int i = 0;i < BOARD_SIZE;i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = "+";
            }
        }
    }

    public void printBoard(){
        for(int i = 0;i < BOARD_SIZE;i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                System.out.print(board[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) throws Exception {
        GoBang goBang = new GoBang();
        goBang.initBoard();
        goBang.printBoard();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = null;
        while((inputStr = br.readLine())!=null){
            String[] posStrArr = inputStr.split(",");
            int xPos = Integer.parseInt(posStrArr[0]);
            int yPos = Integer.parseInt(posStrArr[1]);
            goBang.board[xPos-1][yPos-1] = "@";
            goBang.printBoard();
            System.out.println("Input your Pos.");
        }
    }
}
