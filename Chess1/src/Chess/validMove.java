package Chess;
import Chess.ChessPiece.PieceColor;

public class validMove {

	
	public static int mpieceMove(Tuple from, Tuple to, int moveX,int moveY,PieceColor currentPlayer, Board board, int c)
	{
		Tile[][] b = board.getBoardArray();
		Move[] moves = b[from.Y()][from.X()].getPiece().getPieceMove();
		int m = 0;
		if (b[from.Y()][from.X()].getPiece().getColor() == currentPlayer) {
			for (Move move1 : moves) {
				if ((moveX == move1.getX()) && (moveY == move1.getY())) {
					m = 1;
					if (b[to.Y()][to.X()].isEmpty()) {
						b[to.Y()][to.X()].setPiece(b[from.Y()][from.X()].getPiece());
						b[from.Y()][from.X()].empty();

					} else {
						System.out.println("Invalid move");
						c=1;
					}
				}
			}
			if (m != 1) {
				System.out.println("Invalid move");
				c=1;
			}
		} else {
			System.out.println("It's not your tourn!");
			c=1;
		}
		
		return c;
	}
	
	
	public static int mpieceMoveonTake(Tuple from, Tuple to, int moveX,int moveY,PieceColor currentPlayer, Board board, int c)
	{
		Tile[][] b = board.getBoardArray();
		int crossX;
		int crossY;
		if(moveX==-2 )
		{crossX=-1;}
		else{crossX=1;}
		if(moveY==-2 )
		{crossY=-1;}
		else{crossY=1;}
         System.out.println(moveX);
         System.out.println(moveY);
		Move[] moves2 = b[from.Y()][from.X()].getPiece().getPieceMoveonTake();
		int m = 0;
		if (b[from.Y()][from.X()].getPiece().getColor() == currentPlayer) {
			for (Move move2 : moves2) {
				if ((moveX == move2.getX()) && (moveY == move2.getY())) {
                     m=1;
					if (b[to.Y()][to.X()].isEmpty()) {
						if (!b[from.Y() + crossY][from.X() + crossX].isEmpty()) {
							if (b[from.Y() + crossY][from.X() +crossX].getPiece().getColor().toString().equals(currentPlayer.toString())) {
								System.out.println("Invalid move");
							} else {
								
								b[to.Y()][to.X()].setPiece(b[from.Y()][from.X()].getPiece());
								b[from.Y() + crossY][from.X() + crossX].empty();
								b[from.Y() ][from.X() ].empty();
							}
						}

					} else {
						System.out.println("Invalid move");
						c=1;
					}
				}
			}
			if (m != 1) {
				System.out.println("Invalid move");
				c=1;
			}
		} else {
			System.out.println("It's not your tourn!");
			c=1;
		}
	     return c;
	}
	
	
	
	
	
}
