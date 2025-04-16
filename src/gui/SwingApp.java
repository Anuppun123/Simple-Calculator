// package gui;
// import javax.swing.JFrame;
// import javax.swing.JLabel;
// import javax.swing.JTextArea;
// import javax.swing.JTextField;
// import javax.swing.ButtonGroup;
// import javax.swing.JButton;
// import javax.swing.JComboBox;
// import javax.swing.JPasswordField;
// import javax.swing.JRadioButton;

// public class SwingApp {
//     public static void main(String[] args) {

//         //create a frame
//         JFrame frame = new JFrame();
//         frame.setTitle("Login Form");
//         //frame size
//         frame.setSize(700,450);
//         //close on exit
//         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame.setLayout(null);
//          frame.setVisible(true);
        
//          JFrame frame1 = new JFrame();
//         frame1.setTitle("Login Form");
//         //frame size
//         frame1.setSize(400,250);
//         //close on exit
//         frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         frame1.setLayout(null);
//          frame1.setVisible(true);


//         JLabel RegisterHere = new JLabel("Register Here");
//         RegisterHere.setBounds(250,10,100,40);
//         frame.add(RegisterHere);
        
//         JLabel name = new JLabel("Name : ");
//         name.setBounds(50,50,100,30);
//         frame.add(name);
//         JTextField namearea = new JTextField();
//         namearea.setBounds(200,50,300,30);
//         frame.add(namearea);

//         JLabel email = new JLabel("Email :" );
//         email.setBounds(50,100,100,30);
//         frame.add(email);
//         JTextField emailarea = new JTextField();
//         emailarea.setBounds(200,100,300,30);
//         frame.add(emailarea);

//         JLabel password = new JLabel("Password :");
//         password.setBounds(50,150,100,30);
//         frame.add(password);
//         JPasswordField passwordarea = new JPasswordField();
//         passwordarea.setBounds(200,150,300,30);
//         frame.add(passwordarea);
         

//         JLabel gender = new JLabel("Gender :");
//         gender.setBounds(50,200,100,30);
//         frame.add(gender);
//         JRadioButton genderarea = new JRadioButton("Male");
//         genderarea.setBounds(200, 200, 100, 30);
//         frame.add(genderarea);
//         JRadioButton genderarea1 = new JRadioButton("Female");
//         genderarea1.setBounds(300, 200, 100, 30);
//         frame.add(genderarea1);

//         //Group the radio buttons so only one can be selected at a time
//         ButtonGroup group = new ButtonGroup();
//         group.add(genderarea);
//         group.add(genderarea1);


//         JLabel city = new JLabel("City :");
//         city.setBounds(50,250,100,30);
//         frame.add(city);

//         //Combobox for drop down
//         String[] cities = {"", "Essen", "Duisburg", "Düsseldorf", "Köln"};
//         JComboBox citiesOption = new JComboBox(cities);
//         citiesOption.setBounds(200, 250, 300, 30);
//         frame.add(citiesOption);



//         //Create a Button oject
//         JButton button = new JButton("Register");
//         button.setBounds(200, 300, 100, 30);
//         //add button in frame
//         frame.add(button);
//          //Create a Button oject
//          JButton button1 = new JButton("Cancel");
//          button1.setBounds(350, 300, 100, 30);
//          //add button in frame
//          frame.add(button1);



       

//     }

// }


package gui;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.*;
import java.awt.*;

public class SwingApp {
    public static void main(String[] args) {
        // Create the main frame
        JFrame frame = new JFrame("Two Forms in One Page");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new GridLayout(1, 2)); // Two columns side by side

        // -------------------- Form 1: Login --------------------
        JPanel loginPanel = new JPanel();
        loginPanel.setLayout(new BoxLayout(loginPanel, BoxLayout.Y_AXIS));
        loginPanel.setBorder(BorderFactory.createTitledBorder("Login Form"));

        JTextField usernameField = new JTextField(10);
        JPasswordField passwordField = new JPasswordField(10);
        JButton loginBtn = new JButton("Login");

        loginPanel.add(new JLabel("Username:"));
        loginPanel.add(usernameField);
        loginPanel.add(new JLabel("Password:"));
        loginPanel.add(passwordField);
        loginPanel.add(loginBtn);

        // -------------------- Form 2: Contact --------------------
        JPanel contactPanel = new JPanel();
        contactPanel.setLayout(new BoxLayout(contactPanel, BoxLayout.Y_AXIS));
        contactPanel.setBorder(BorderFactory.createTitledBorder("Contact Form"));

        JTextField nameField = new JTextField(10);
        JTextField emailField = new JTextField(10);
        JButton submitBtn = new JButton("Submit");

        contactPanel.add(new JLabel("Name:"));
        contactPanel.add(nameField);
        contactPanel.add(new JLabel("Email:"));
        contactPanel.add(emailField);
        contactPanel.add(submitBtn);

        // Add both forms to the frame
        frame.add(loginPanel);
        frame.add(contactPanel);

        // Show the frame
        frame.setVisible(true);
    }
}

