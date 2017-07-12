package Chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Chess.ChessPiece.PieceColor;

public class MainChess {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PieceColor currentPlayer;
		Board board = new Board();
		Tile[][] b1 = board.getBoardArray();
		PrintBoard.printB(board);
		InputHandler in = new InputHandler();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		currentPlayer = PieceColor.White;
		boolean Isendofgame=false;  
		int c=0;
		while (!Isendofgame) {

			System.out.println("Enter move (eg. A2-B3):");
			String move = br.readLine();

			Tuple from = in.getFrom(move);
			Tuple to = in.getTo(move);
			int moveX = to.X() - from.X();
			int moveY = to.Y() - from.Y();
            c=0;
			if ((moveX == 1 || moveX == -1) && (moveY == 1 || moveY == -1)) {
				c=validMove.mpieceMove( from, to, moveX, moveY, currentPlayer, board,c);
			}

			else if ((moveX == 2 || moveX == -2) && (moveY == 2 || moveY == -2)) {
				c=validMove.mpieceMoveonTake( from, to, moveX, moveY, currentPlayer, board,c);
			} else {
				System.out.println("Invalid move");
				c=1;
			}
			
			
			if(currentPlayer ==PieceColor.White && c==0  )
			{
				currentPlayer=PieceColor.Black;
			}else if(currentPlayer ==PieceColor.Black && c==0)
			{currentPlayer =PieceColor.White;}
			else{}
			String left=""; 
			int p=0;
			for(int k=0; k<b1.length;k++)
			{
              for(int j=0; j<b1.length;j++)
              {
            	  if(!b1[k][j].isEmpty())
            	  {
            		 p++; 
            		 left=b1[k][j].getPiece().getIcon();
            	  }
              }
 			}
			
			if(p==1)
			{Isendofgame=true;
			System.out.println("End of the game! ");
			System.out.println("The winner is "+left);
			}
			PrintBoard.printB(board);
		}
	}

}
