package fr.eni.encheres.ihm;

import javax.swing.*;
import java.awt.*;

public class FenetreDesktop extends JFrame {
        public FenetreDesktop() {
            this.setSize(new Dimension(650, 750));
            JLabel entete = new JLabel();
            entete.setText("ENI-ENCHERES");
            this.add(entete);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.setVisible(true);
        }

}
