package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;

public class SwingApp {
    public static void main(String[] args) {

        //create a frame
        JFrame frame = new JFrame();
        frame.setTitle("Login Form");
        //frame size
        frame.setSize(700,450);
        //close on exit
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        

        JLabel RegisterHere = new JLabel("Register Here");
        RegisterHere.setBounds(250,10,100,40);
        frame.add(RegisterHere);
        
        JLabel name = new JLabel("Name : ");
        name.setBounds(50,50,100,30);
        frame.add(name);
        JTextField namearea = new JTextField();
        namearea.setBounds(200,50,300,30);
        frame.add(namearea);

        JLabel email = new JLabel("Email :" );
        email.setBounds(50,100,100,30);
        frame.add(email);
        JTextField emailarea = new JTextField();
        emailarea.setBounds(200,100,300,30);
        frame.add(emailarea);

        JLabel password = new JLabel("Password :");
        password.setBounds(50,150,100,30);
        frame.add(password);
        JPasswordField passwordarea = new JPasswordField();
        passwordarea.setBounds(200,150,300,30);
        frame.add(passwordarea);

        JLabel gender = new JLabel("Gender :");
        gender.setBounds(50,200,100,30);
        frame.add(gender);
        JRadioButton genderarea = new JRadioButton("Male");
        genderarea.setBounds(200, 200, 100, 30);
        frame.add(genderarea);
        JRadioButton genderarea1 = new JRadioButton("Female");
        genderarea1.setBounds(300, 200, 100, 30);
        frame.add(genderarea1);

        JLabel city = new JLabel("City :");
        city.setBounds(50,250,100,30);
        frame.add(city);

        //Combobox for drop down
        String[] cities = {"", "Essen", "Duisburg", "Düsseldorf", "Köln"};
        JComboBox citiesOption = new JComboBox(cities);
        citiesOption.setBounds(200, 250, 300, 30);
        frame.add(citiesOption);



        //Create a Button oject
        JButton button = new JButton("Register");
        button.setBounds(200, 300, 100, 30);
        //add button in frame
        frame.add(button);
         //Create a Button oject
         JButton button1 = new JButton("Cancel");
         button1.setBounds(350, 300, 100, 30);
         //add button in frame
         frame.add(button1);



       

    }

}
