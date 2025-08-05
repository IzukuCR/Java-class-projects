import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainGui {
   public static void main(String args[]) {
        JFrame gui = new JFrame("Hello World");
		gui.setSize(400,200);
		gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		gui.setVisible(true);
		System.out.println("Main termina!");
    }    
}
