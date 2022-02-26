public class App {
    public static void main(String[] args) throws Exception 
    {

        String startingFen = "rnbqkbnr/pppppppp/8/8/8/8/PPPPPPPP/RNBQKBNR";

        FrameManager frameManager = new FrameManager();
        Board board = new Board(startingFen);
        
        board.printBoard();

        





    }

}
