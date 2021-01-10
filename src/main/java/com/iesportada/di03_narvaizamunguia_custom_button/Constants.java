/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iesportada.di03_narvaizamunguia_custom_button;

import java.awt.*;

/**
 *
 * @author s0ck3
 */
public class Constants {
    public static final int BUTTON_FONT_SIZE = 14;
    public static final int MESSAGE_TYPE = 1;

    public static final Dimension BUTTON_SIZE = new Dimension(81,40);

    public static final Color WHITE = new Color(255,255,255);
    public static final Color BLUE = new Color(0, 123, 255);
    public static final Color YELLOW = new Color(255, 193, 7);
    public static final Color RED = new Color(220, 53, 69);
    public static final Font BUTTON_FONT = new Font("SansSerif", Font.PLAIN, BUTTON_FONT_SIZE);

    public static final String PRIMARY_TEXT = "Primary";
    public static final String WARNING_TEXT = "Warning";
    public static final String DANGER_TEXT = "Danger";
    public static final String PRIMARY_DIALOG = ("Font Family: SansSerif\nHeight: 40\nWidth:81\nText: " + PRIMARY_TEXT + "\nText size: " + BUTTON_FONT_SIZE + "\nRGB Component Foreground: " + String.valueOf(WHITE) + "\nRGB Component Background: " + String.valueOf(BLUE));
    public static final String WARNING_DIALOG = ("Font Family: SansSerif\nHeight: 40\nWidth:81\nText: " + WARNING_TEXT + "\nText size: " + BUTTON_FONT_SIZE + "\nRGB Component Foreground: " + String.valueOf(WHITE) + "\nRGB Component Background: " + String.valueOf(YELLOW));
    public static final String DANGER_DIALOG = ("Font Family: SansSerif\nHeight: 40\nWidth:81\nText: " + DANGER_TEXT + "\nText size: " + BUTTON_FONT_SIZE + "\nRGB Component Foreground: " + String.valueOf(WHITE) + "\nRGB Component Background: " + String.valueOf(RED));
    public static final String INFO_TITLE_PRIMARY = "JavaBeans Custom Primary Button Information";
    public static final String INFO_TITLE_WARNING = "JavaBeans Custom Warning Button Information";
    public static final String INFO_TITLE_DANGER = "JavaBeans Custom Danger Button Information";
    
}
