import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class createApp {
    gen g1 = new gen();
    JFrame f = new JFrame("PassWord Generator");
    JTextField t = new JTextField();
    JButton b = new JButton("Gen");
    JButton b1 = new JButton("Save");
    JButton b2 = new JButton("clear");
    JLabel l1 = new JLabel("FilterOut");
    JCheckBox c1 = new JCheckBox("UpperCase");
    JCheckBox c2 = new JCheckBox("Numeric");
    JCheckBox c3 = new JCheckBox("special characters");






    public void design() {
        t.setBounds(50, 50, 150, 20);
        b.setBounds(50, 100, 95, 30);
        b1.setBounds(50, 150, 95, 30);
        b2.setBounds(200, 150, 95, 30);
        l1.setBounds(50, 170, 100, 100);
        c1.setBounds(50, 200, 100, 100);
        c2.setBounds(50, 250, 100, 100);
        c3.setBounds(50, 300, 300, 100);


        f.add(b);
        f.add(t);
        f.add(b1);
        f.add(b2);
        f.add(l1);
        f.add(c1);
        f.add(c2);
        f.add(c3);
        f.setSize(500, 500);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public void logic(){
        t.setEnabled(false);
        String password = g1.randChars();
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setText(password);
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t.setText("");
            }
        });
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    g1.writeFile(password);
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }





}
