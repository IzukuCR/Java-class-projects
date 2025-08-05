import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;

public class MainGuiControles {
   public static void main(String args[]) {
	   //sets look & feel
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {
		}
		
        JFrame gui = new JFrame("Employee");
		gui.setSize(400,200);
		gui.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        gui.setLayout(null);

        JLabel ssn_l=new JLabel("SSN:");
        ssn_l.setBounds(20, 10, 40, 30);
        gui.add(ssn_l);

        JTextField ssn_t=new JTextField("");
        ssn_t.setBounds(60, 10, 150, 30);
        gui.add(ssn_t);
        
        JButton save_b=new JButton("Guardar");
        save_b.setBounds(60, 100, 100, 30);
        gui.add(save_b);	

		gui.setVisible(true);
		System.out.println("Main termina!");
    }    
}