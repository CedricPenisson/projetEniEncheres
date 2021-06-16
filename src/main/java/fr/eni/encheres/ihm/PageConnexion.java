package fr.eni.encheres.ihm;

import javax.swing.*;
import java.awt.*;

public class PageConnexion extends Fenetre {
    public static void main(String[] args) {
        Fenetre fenetre = new Fenetre();
        fenetre.setVisible(true);
        fenetre.setTitle("Page de connexion");
        fenetre.setSize(new Dimension(700, 750));
        fenetre.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
