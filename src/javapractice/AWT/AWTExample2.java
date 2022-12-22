package AWT;

import java.awt.*;
import javax.swing.*;

public class AWTExample2 {
    AWTExample2(){
    JFrame f = new JFrame();
    Label l = new Label("Employee Id: ");
    Button b = new Button("Submit!");
    TextField t = new TextField();
    l.setBounds(20,70,80,20);
    t.setBounds(20,100,80,20);
    b.setBounds(100, 100, 80, 20);
    f.add(b);
    f.add(l);
    f.add(t);
    f.setSize(400, 300);
    f.setTitle("Employee Info");
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String args[]){
        new AWTExample2();
    }
}
