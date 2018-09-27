package ru.zlygostev;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Chat extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextArea textArea1;
    private JTextField textField1;
    private JButton sendButton;

    private void sendMessage() {
        textArea1.append(textField1.getText() + "\n");
        textField1.setText("");
    }

    public Chat() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        sendButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sendMessage();
            }
        });
    }

    public static void main(String[] args) {
        Chat dialog = new Chat();
        dialog.pack();
        dialog.setSize(450, 300);
        dialog.setVisible(true);

        System.exit(0);
    }
}
