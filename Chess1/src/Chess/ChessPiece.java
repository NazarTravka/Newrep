package Chess;

public class ChessPiece {
	private final PieceColor color;
	 private Move[] pieceMove;
	  private Move[] pieceMoveonTake;
	private String icon;

	
	protected ChessPiece(PieceColor color, String icon, Move[] pieceMove,Move[] pieceMoveonTake) {
		this.color = color;
		this.icon=icon;
		this.pieceMove=pieceMove;
		this.pieceMoveonTake=pieceMoveonTake;
	}

	public enum PieceColor {
		White, Black
	}

	public static PieceColor opponent(PieceColor color) {
		return (color == PieceColor.Black) ? PieceColor.White : PieceColor.Black;
	}

	public PieceColor getColor() {
		return color;
	}

	public Move[] getPieceMove() {
		return pieceMove;
	}



	public Move[] getPieceMoveonTake() {
		return pieceMoveonTake;
	}

	

	public  String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

}
