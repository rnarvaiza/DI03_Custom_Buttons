
package com.iesportada.di03_narvaizamunguia_custom_button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;
import javax.swing.*;

/**
 *
 * @author RNarvaizamunguia
 */
public class Danger extends JButton implements EventListener{

    
        public Danger(){
        super();
        init();
    }
    
        private void init(){

        setBackground(Constants.WHITE);
        setForeground(Constants.RED);
        setFont(Constants.BUTTON_FONT);
        setPreferredSize(Constants.BUTTON_SIZE);
        setText(Constants.DANGER_TEXT);
        setAlignmentX(CENTER_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Constants.RED);
                setForeground(Constants.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Constants.WHITE);
                setForeground(Constants.RED);
            }

            @Override
            public void mousePressed(MouseEvent e){
                JOptionPane.showMessageDialog(null, Constants.DANGER_DIALOG, Constants.INFO_TITLE_DANGER, Constants.MESSAGE_TYPE);

            }
        });
    }
    
}
