/*
 * Created by JFormDesigner on Wed Jun 16 10:56:22 CEST 2021
 */

package fr.eni.encheres.ihm;

import java.awt.*;
import javax.swing.*;

/**
 * @author unknown
 */
public class Fenetre extends JFrame {
    public Fenetre() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        panel2 = new JPanel();
        label1 = new JLabel();
        panel1 = new JPanel();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //======== panel2 ========
        {
            panel2.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border.
            EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDes\u0069gner \u0045valua\u0074ion", javax. swing. border. TitledBorder. CENTER, javax. swing
            . border. TitledBorder. BOTTOM, new java .awt .Font ("D\u0069alog" ,java .awt .Font .BOLD ,12 ),
            java. awt. Color. red) ,panel2. getBorder( )) ); panel2. addPropertyChangeListener (new java. beans. PropertyChangeListener( )
            { @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("\u0062order" .equals (e .getPropertyName () ))
            throw new RuntimeException( ); }} );
            panel2.setLayout(new FlowLayout());

            //---- label1 ----
            label1.setText("ENI-ENCHERES");
            panel2.add(label1);
        }
        contentPane.add(panel2, BorderLayout.NORTH);

        //======== panel1 ========
        {
            panel1.setMinimumSize(new Dimension(750, 650));
            panel1.setLayout(new GridLayout(8, 10));
        }
        contentPane.add(panel1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel panel2;
    private JLabel label1;
    private JPanel panel1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
