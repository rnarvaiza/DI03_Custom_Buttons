
package com.iesportada.di03_narvaizamunguia_custom_button;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.EventListener;
import javax.swing.*;

/**
 *
 * @author RNarvaizamunguia
 */
public class Primary extends JButton implements EventListener{

    
        public Primary(){
        super();
        init();
    }
    
        private void init(){

        setBackground(Constants.WHITE);
        setForeground(Constants.BLUE);
        setFont(Constants.BUTTON_FONT);
        setPreferredSize(Constants.BUTTON_SIZE);
        setText(Constants.PRIMARY_TEXT);
        setAlignmentX(CENTER_ALIGNMENT);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(Constants.BLUE);
                setForeground(Constants.WHITE);
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(Constants.WHITE);
                setForeground(Constants.BLUE);
            }

            @Override
            public void mousePressed(MouseEvent e){
                JOptionPane.showInternalMessageDialog(null, Constants.PRIMARY_DIALOG, Constants.INFO_TITLE_PRIMARY, Constants.MESSAGE_TYPE);

            }
        });
    }
    
}
