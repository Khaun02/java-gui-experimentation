import java.awt.Color;

import javax.swing.JFrame;

public class GUI extends JFrame {

    // constructor for creating the frame
    public GUI() {
        // JFrame frame = new JFrame();
        //      since this class extends from JFrame, it has all the necessary methods already, so i can use this.
        // makes it so you can actually see the frame
        this.setVisible(true);
        // sets x and y dimension of frame
        this.setSize(500, 500);
        // sets the title, the top part of the frame
        this.setTitle("JFrame Title");
        // originlly when we click the "x" it just hides, it doesnt close
        //      this will actually close the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // makes it so you cannot resize the frame
        this.setResizable(false);
        // changing the color of background
        this.getContentPane().setBackground(new Color(250,250,250));
    }
    
}
