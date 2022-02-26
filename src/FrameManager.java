import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameManager 
{
    
    private JFrame frame;
    private JButton[][] chessBoardSquares;
    private JPanel surface;

    public FrameManager() 
    {
        initFrame();
        
    }


    private void initFrame()
    {
        frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }
    

    private void initBoard()
    {
        chessBoardSquares = new JButton[8][8];

    }

    


}
