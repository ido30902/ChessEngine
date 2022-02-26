public class Piece 
{
    
    private char type;
    private boolean isWhite;

    public Piece(char type, boolean isWhite) 
    {
        this.type = type;
        this.isWhite = isWhite;
    }
    
    public boolean isWhite()
    {
        return isWhite;
    }


    public char getType()
    {
        return type;
    }


}
