package boardgame;

public class Position {
	private int row, column;

	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(byte row) {
		this.row = row;
	}

	public int getColunm() {
		return column;
	}

	public void setColunm(byte column) {
		this.column = column;
	}
	
	@Override
	public String toString() {
		return row + ", " + column;
	}
	
}
