package gui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Testing {

    public static void main(String[] args) {
        JFrame frame = new JFrame("testing");
        frame.setDefaultCloseOperation(3);
        frame.setSize(600, 400);
        frame.setLayout(null);

          // Create a label object
          JLabel label = new JLabel();
          label.setText("Hello Darling");
          label.setBounds(200,40,100,30);
          frame.add(label);

        JButton button = new JButton("click");
        button.setBounds(200,60,100,30);
        frame.add(button);  

        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                label.setText("Clicked");
            }
    });


    JTextField textfield = new JTextField();
    textfield.setBounds(200,90,100,30);
    frame.add(textfield);
      
    JButton button1 = new JButton("Login");
    button1.setBounds(200,120, 100,30);
    frame.add(button1);

    button1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e){
            System.out.println("Hello : "+textfield.getText());

        JOptionPane.showMessageDialog(button1, "Hello: "+textfield.getText());
        }
    });








        frame.setVisible(true);
    }

}
