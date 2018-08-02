package GUI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Hala
 */
public class Hajj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HomePage Home = new HomePage();
        //left - up
        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Desktop\\Hajj\\Hajj\\src\\icon.png");
        Home.setIconImage(img.getImage());
        Home.setBounds(255, 100, 825, 526);
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setVisible(true);
        Home.setResizable(false);
        
    }
    
}
