package Personas;

import javax.swing.*;

import java.awt.*;

public class View {
    private JTextField textFieldID;
    private JTextField textFieldName;
    private JRadioButton maleRadioButton;
    private JRadioButton femaleRadioButton;
    private JRadioButton otherRadioButton;
    private JPanel panel;
    private JLabel maritalStatus;
    private JComboBox comboBox1;
    private JCheckBox musicCheckBox;
    private JCheckBox videoGamesCheckBox;
    private JCheckBox moviesCheckBox;
    private JCheckBox cookCheckBox;
    private JCheckBox sportsCheckBox;
    private JCheckBox otherCheckBox;
    private JTextField textField1;
    private JButton saveButton;
    private JButton cancelButton;

    public JPanel getPanel() {
        return panel;
    }

    public View() {
        Highligther highligther = new Highligther(Color.RED);

        textFieldID.addMouseListener(highligther);
        textFieldName.addMouseListener(highligther);
        textField1.addMouseListener(highligther);

    }
}
