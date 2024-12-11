import javax.swing.JLabel;

public class Main {

    public static void main(String[] args) {
        // if we dont need the variable, or we dont need to make changes here, we can just make the frame
        GUI frame = new GUI();

        // constructor for label, shortcut to add text is just adding inside the Jlabel()
        JLabel label = new JLabel("Hello World");
        //now we have to add this label to the GUI
        frame.add(label);

    }
}