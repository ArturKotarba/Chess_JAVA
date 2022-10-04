//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//public class WannaPlayDialog extends JFrame {
//
//    WannaPlayDialog() {
//
//        setTitle("Main dialog");
//        setSize(300, 300);
//
//        setLocation(50,50);
//        setLayout(new FlowLayout());
//
//        JButton yesButton = new JButton("Yes");
//        add(yesButton);
//
//        stateOfDialog state = stateOfDialog.noButtonPressed;
//
//        yesButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e)  {
//                if (!yesButton.getModel().isPressed()) {
//                    state = stateOfDialog.yesButtonPressed;
//                    stateOfDialog(state);
//                }
//            }
//        });
//    }
//
//    public void stateOfDialog(stateOfDialog isPressed) {
//        retVal = isPressed;
//    }
//
//    public stateOfDialog stateOfDialog() {
//        return stateOfDialog;
//    }
//
//    enum stateOfDialog {
//        yesButtonPressed,
//        noButtonPressed,
//        nonButtonPressed
//    }
//}
