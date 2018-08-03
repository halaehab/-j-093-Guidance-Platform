/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalman;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class MedicalMan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        medicalManInterface Home = new medicalManInterface();
        //left - up
        ImageIcon img = new ImageIcon("C:\\Users\\Hala\\Desktop\\New folder\\FingerPrint\\src\\GUI\\icon.png");
        Home.setIconImage(img.getImage());
        Home.setBounds(255, 100, 825, 526);
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setResizable(false);
        Home.setVisible(true);
    }
    
}
