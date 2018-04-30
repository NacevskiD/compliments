package compliments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComplimentsGUI extends JFrame{
    private JPanel mainPanel;
    private JLabel complimentText;
    private JButton getCompliment;

    ComplimentsGUI(){
        setContentPane(mainPanel);
        setPreferredSize(new Dimension(400,150));
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        getCompliment.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                complimentText.setText("Thinking of a compliment..");
                ComplimentClient.getCompliment(ComplimentsGUI.this);
            }
        });
    }

    public void complimentMessage(String compliment){
        complimentText.setText(compliment);
    }

}
