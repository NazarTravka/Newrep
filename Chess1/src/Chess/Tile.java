package Chess;


public class Tile {

    private ChessPiece piece;
    private  TileColor color;
    public enum TileColor{
        White, Black
    }

    public Tile(TileColor color){
        this.color = color;
    }

    public Tile(TileColor color, ChessPiece piece){
        this.color = color;
        this.piece = piece;
    }

    public void setPiece(ChessPiece piece){
        this.piece = piece;
    }

    public ChessPiece getPiece(){
        return this.piece;
    }
@Override
     public String toString(){
        if(piece != null){
            return "[" + piece.getIcon() + "]";
        } else {
            return "[ ]";
        }
    }

    public boolean isEmpty(){
        return piece == null;
    }

    public void empty(){
        piece = null;
    }

	public TileColor getColor() {
		return color;
	}

	
}
