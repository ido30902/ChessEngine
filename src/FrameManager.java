import javax.swing.JFrame;

public class FrameManager 
{
    
    private JFrame frame;

    public FrameManager() 
    {
        frame = new JFrame("Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 800);
        frame.setVisible(true);
    }

    


}
