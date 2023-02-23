import java.awt.*;
import java.awt.event.*;

public class Ex7_19 {

    public static void main(String[] args) {
        Button b = new Button("start");
        b.addActionListener(new ActionListener() {  //익명클래스: 클래스의 선언과 객체의 생성을 동시에함.
            public void actionPerformed(ActionEvent e) {
                System.out.println("ActionEvent occurred!!!");
            }
        });
    }
}
