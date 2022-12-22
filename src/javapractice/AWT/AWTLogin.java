package AWT;

import java.awt.*;

public class AWTLogin extends Frame{
    AWTLogin(){
        Label l = new Label("Login: ");
        Label p = new Label("Password: ");
        Button b = new Button("Click Me");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        
        l.setBounds(30,80,80,30);
        p.setBounds(30,100,80,30);
        t1.setBounds(100,80,80,20);
        t2.setBounds(100,100,80,20);
        b.setBounds(100, 130, 80, 30);
        
        add(l);
        add(p);
        add(t1);
        add(t2);
        add(b);
        setSize(400,300);
        setTitle("Login Page");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String args[]){
        new AWTLogin();
    }
}
