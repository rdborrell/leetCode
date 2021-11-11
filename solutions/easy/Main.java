package solutions.easy;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener
{
    int clicks = 0;
    JLabel label;
    JPanel panel;
    public Main()
    {
        JFrame frame = new JFrame();

        JButton button = new JButton("Solve!");
        button.addActionListener(this);
        label = new JLabel("Solved!");
        JTextField field = new JTextField();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(field);
        panel.add(button);
        panel.add(label);


        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Program");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String ...args)
    {
        new Main();
        MostWealth wealth = new MostWealth();
        int[][] testArray = {{2,8,7},{7,1,3},{1,9,5}};
        wealth.solve(testArray);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        clicks++;
        label.setText("Number of clicks: " + clicks);
    }
}