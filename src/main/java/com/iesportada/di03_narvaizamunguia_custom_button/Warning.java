
package com.iesportada.di03_narvaizamunguia_custom_button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;
import javax.swing.*;

/**
 *
 * @author RNarvaizamunguia
 */
public class Warning extends JButton implements EventListener{

    
        public Warning(){
        super();
        init();
    }
    
        private void init(){

        setBackground(Constants.WHITE);
        setForeground(Constants.YELLOW);
        setFont(Constants.BUTTON_FONT);
        setPreferredSize(Constants.BUTTON_SIZE);
        setText(Constants.WARNING_TEXT);
        setAlignmentX(CENTER_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Constants.YELLOW);
                setForeground(Constants.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Constants.WHITE);
                setForeground(Constants.YELLOW);
            }

            @Override
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(null, Constants.WARNING_DIALOG, Constants.INFO_TITLE_WARNING, Constants.MESSAGE_TYPE);

            }
        });
    }
    
}
