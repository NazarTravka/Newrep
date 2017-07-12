package Chess;

import Chess.ChessPiece.PieceColor;
import Chess.Tile.TileColor;

public class Board {
	private Tile[][] board;
	private ChessPiece[] W = new ChessPiece[16];
	private ChessPiece[] B = new ChessPiece[16];

	public Board() {
		board = new Tile[8][8];
		initialize();
		Fill();
	}

	public void initialize() {
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (i % 2 == 0) {
					if (j % 2 == 0)
						board[i][j] = new Tile(TileColor.Black);
					else
						board[i][j] = new Tile(TileColor.White);
				} else {
					if (j % 2 == 0)
						board[i][j] = new Tile(TileColor.White);
					else
						board[i][j] = new Tile(TileColor.Black);
				}
			}

		}
	}

	public void Fill() {
		for (int i = 0; i < W.length; i++) {

			W[i] = new ChessPiece(PieceColor.White, "W", new Move[]{new Move(-1,-1),new Move(1,-1)}, new Move[]{new Move(-2,-2),new Move(2,-2)});
			B[i] = new ChessPiece(PieceColor.Black, "B", new Move[]{new Move(-1,1),new Move(1,1)}, new Move[]{new Move(-2,2),new Move(2,2)});
		}
		int n = 0;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if (board[i][j].getColor() == Tile.TileColor.Black && i < 2) {
					board[i][j].setPiece(B[n++]);
				} else if ((board[i][j].getColor() == Tile.TileColor.Black) && (i > 5 && i < 8)) {
					board[i][j].setPiece(W[n++]);
				} else {
					continue;
				}
			}
		}
		
	}
   
	public Tile[][] getBoardArray() {
		return board;
	}
}
