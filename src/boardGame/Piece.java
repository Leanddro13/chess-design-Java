package boardGame;

public class Piece {
	protected Position position;
	private Board board;

	public Piece(Board board) {
		this.board = board;
		position = null;
	}
	// Apenas classes do pacote boardGame, podem acessar o tabuleiro
	protected Board getBoard() {
		return board;
	}

	
}
