
package layoutex;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUI extends JFrame implements ActionListener {
    JLabel info = new JLabel("Select one or more hobbies from the boxes given below:");
    JLabel info2 = new JLabel("Select a color below: ");
    JCheckBox gymCheck = new JCheckBox ("Gym");
    JCheckBox footballCheck = new JCheckBox("Football");
    JCheckBox netFlixCheck = new JCheckBox("NetFlix");
    JLabel labelHobbies = new JLabel();
    JButton btnSubmit = new JButton("Submit");
    String hobbies ="";
    
    JRadioButton redBtn = new JRadioButton("Red");
    JRadioButton blueBtn = new JRadioButton("Blue");
    JRadioButton greenBtn = new JRadioButton("Green");
    
    ButtonGroup colorsGroup = new ButtonGroup(); 
    
    GUI (){
        
        setLocationRelativeTo(null);
        setMinimumSize(new Dimension (380,200));
        setTitle ("GUI Exercise");
        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLayout (new FlowLayout());
        
        
        colorsGroup.add(redBtn);
        colorsGroup.add(greenBtn);
        colorsGroup.add(blueBtn);
        
        add(info);
        add(gymCheck);
        add(footballCheck);
        add(netFlixCheck);
        add(info2);
        add(redBtn);
        add(blueBtn);
        add(greenBtn);
        add(btnSubmit);
        add(labelHobbies);
        

        
        btnSubmit.addActionListener(this);

    }

    public static void main(String[] args) {
        
        GUI myGUI = new GUI();
        myGUI.setVisible(true);
    }

    public void actionPerformed(ActionEvent action) {

        
       hobbies="";
        
         if (gymCheck.isSelected())
             hobbies += "Gym ";
         if (footballCheck.isSelected())
             hobbies += "Football ";
         if (netFlixCheck.isSelected())
             hobbies += "Netflix ";
         
         
         if (greenBtn.isSelected())
              getContentPane().setBackground(Color.GREEN);
         else if (redBtn.isSelected())
              getContentPane().setBackground(Color.RED);
         else if (blueBtn.isSelected())
              getContentPane().setBackground(Color.BLUE);

         
         labelHobbies.setText(hobbies);
         labelHobbies.setFont(new Font("Verdana",Font.BOLD,22));
         labelHobbies.setForeground(Color.BLACK);
    }
    
}