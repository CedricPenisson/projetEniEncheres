package fr.eni.encheres.ihm;

import javax.swing.*;
import java.awt.*;

public class PageCreerCompte extends FenetreDesktop {
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
        fenetre.setVisible(true);
        fenetre.setTitle("Creation de compte");
        fenetre.setSize(new Dimension(700, 750));
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
