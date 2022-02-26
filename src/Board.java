public class Board 
{
    
    private Piece[][] board;

    public Board() 
    {
        board = new Piece[8][8];
    }

    public Board(String fen)
    {
        board = new Piece[8][8];
        loadFen(fen);
    }

    public Piece getPiece(int x, int y) 
    {
        return board[x][y];
    }


    public void loadFen(String fen)
    {
        String[] parts = fen.split(" ");
        String[] rows = parts[0].split("/");
        boolean isWhite = true;
        for (int i = 0; i < rows.length; i++)
        {
            int j = 0;
            for (char c : rows[i].toCharArray())
            {
                if (Character.isLowerCase(c))
                    isWhite = false;

                if (c >= '1' && c <= '8')
                {
                    j += c - '0';
                }
                else
                {
                    board[i][j] = new Piece(c, isWhite);
                    j++;
                }
            }
            isWhite = true;
        }
    }

    public void printBoard()
    {
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8; j++)
            {
                System.out.print(board[i][j] == null ? "." : board[i][j].getType());
            }
            System.out.println();
        }
    }


}
