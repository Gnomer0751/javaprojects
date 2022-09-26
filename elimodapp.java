import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*; 
import java.util.Random;
import java.io.FileWriter; 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;  
import java.io.File; 
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;
import java.io.*;
public class elimodapp {
    public static void main(String args[]){
        new elimodapp();
    }
    public elimodapp() {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrame frame = new JFrame();
                frame.add(new programPane());
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                Image icon = Toolkit.getDefaultToolkit().getImage("joker.png");
                frame.setIconImage(icon);  
            }
        });
    }
    public class programPane extends JPanel{
        public programPane(){
            setBorder(new EmptyBorder(8,8,8,8));
            setLayout(new GridBagLayout());
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridwidth = gbc.REMAINDER;
            gbc.fill = gbc.HORIZONTAL;
            gbc.ipadx = 8;
            gbc.ipady = 8;

            JLabel title = new JLabel("Give Dawson Mod?");
            title.setHorizontalAlignment(JLabel.CENTER);
            add(title, gbc);

            JButton yes = new JButton();
            yes.setText("Yes");
            add(yes, gbc);

            JButton no = new JButton();
            no.setText("No");
            add(no,gbc);

            JButton never = new JButton();
            never.setText("Never");
            add(never,gbc);
            
        yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame tempFrame = new JFrame();
                tempFrame.setSize(400,400);
                tempFrame.setLayout(null);
                tempFrame.setVisible(false);
                JOptionPane.showMessageDialog(null,":)");
                System.exit(0);
            }
        });
        no.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new elimodapp();
            }
        });
        never.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runtime runtime = Runtime.getRuntime();
                try
                {
                    runtime.exec("shutdown -s");
                }
                catch(IOException f)
                {
                    System.out.println("Exception: " +f);
                }
            }
        });

        
    }  
}
}
