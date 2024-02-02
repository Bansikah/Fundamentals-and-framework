package project;

import javax.swing.*;
public class Frame2 {
    public static JFrame frame;
    private JFormattedTextField formattedTextField1;

    public static void main(String [] args){
        frame = new JFrame("Note Keeper");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
