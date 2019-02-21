import java.awt.*;
import java.awt.event.*;

public class CloseFrame extends Frame
{
    public CloseFrame()
    {
        gui();
    }

    public void gui()
    {
        setVisible(true);
        setSize(300,300);
        addWindowListener(new WindowClose(this));
    }
    public static void main(String[] args) {
        CloseFrame obj = new CloseFrame();
    }
}

class WindowClose extends WindowAdapter
{
    CloseFrame obj = null;

    public WindowClose(CloseFrame obj)
    {
        this.obj = obj;
    }

    public void windowClosing(WindowEvent e)
    {
        System.exit(0);
    }
}