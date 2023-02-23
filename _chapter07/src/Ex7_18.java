import java.awt.*;
import java.awt.event.*;
import java.beans.EventHandler;

public class Ex7_18 {

    public static void main(String[] args) {
        Button b = new Button("statt");
        b.addActionListener(new EventHandler());
    }
}

class EventHandler implements ActionListener {

    public void acitonPerforemed(ActionEvent e) {
        System.out.println("ActionEvent occurred!!!");
    }
}