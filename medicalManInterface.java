/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalman;

import java.awt.Image;
import static java.lang.Thread.sleep;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class medicalManInterface extends javax.swing.JFrame {

    /**
     * Creates new form medicalManInterface
     */
    public static String hajj_id;
    
    public medicalManInterface() {
        initComponents();
        //normal();
        currentTime(time);
        connection c = new connection();
        String x = "v";
        ResultSet result1 = connection.setQuery("SELECT hajj_id from notification where type = '" + x + "'");
        try {
            //System.out.println("beyy");
            while (result1.next()) {
                //System.out.println("hii");
                hajj_id = result1.getString("hajj_id");
                //System.out.println("nnnnnnn "+ hajj_id);
            }
        } catch (SQLException ex) {
            System.out.println("cant");
        }
        
        ResultSet result2 = connection.setQuery("SELECT * from hajj_info where id = " + hajj_id);
        try {
            //System.out.println("beyy");
            while (result2.next()) {
                name3.setText(result2.getString("full_name"));
                nationality3.setText(result2.getString("nationality"));
                age3.setText(result2.getString("age"));
                
                byte[] img = result2.getBytes("photo");
                ImageIcon image = new ImageIcon(img);
                Image im = image.getImage();
                Image myImage = im.getScaledInstance(imageLabel.getWidth(), imageLabel.getHeight(), Image.SCALE_SMOOTH);
                ImageIcon newImage = new ImageIcon(myImage);
                imageLabel.setIcon(newImage);
                
            }
        } catch (SQLException ex) {
            System.out.println("cant");
        }
        
        ResultSet result3 = connection.setQuery("SELECT * from campaign_info where hajj_id = " + hajj_id);
        try {
            //System.out.println("beyy");
            while (result3.next()) {
                travel2.setText(result3.getString("campaign_name"));
                Campaign_guide.setText(result3.getString("supervisor_phone"));
            }
        } catch (SQLException ex) {
            System.out.println("cant");
        }
        
        ResultSet result4 = connection.setQuery("SELECT * from chronic_diseases where hajj_id = " + hajj_id);
        try {
            //System.out.println("beyy");
            while (result4.next()) {
                diseases.setText(result4.getString("disease"));
                //Campaign_guide.setText(result4.getString("supervisor_phone"));
            }
        } catch (SQLException ex) {
            System.out.println("cant");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        imageLabel2 = new javax.swing.JLabel();
        imgFrameLabel2 = new javax.swing.JLabel();
        imgFrameLabel1 = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        imageLabel = new javax.swing.JLabel();
        button = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        button3 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        button2 = new javax.swing.JLabel();
        button1 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        nationality3 = new javax.swing.JLabel();
        age3 = new javax.swing.JLabel();
        Campaign_guide = new javax.swing.JLabel();
        Accommodation1 = new javax.swing.JLabel();
        nationality2 = new javax.swing.JLabel();
        imgFrameLabel = new javax.swing.JLabel();
        nationality4 = new javax.swing.JLabel();
        diseases = new javax.swing.JLabel();
        nationality = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imageLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        travel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalman/nnext.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel6);
        jLabel6.setBounds(620, 250, 30, 50);
        getContentPane().add(imageLabel2);
        imageLabel2.setBounds(490, 190, 100, 90);

        imgFrameLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalman/Picture12.png"))); // NOI18N
        getContentPane().add(imgFrameLabel2);
        imgFrameLabel2.setBounds(480, 180, 130, 110);
        getContentPane().add(imgFrameLabel1);
        imgFrameLabel1.setBounds(480, 180, 130, 110);

        time.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(time);
        time.setBounds(60, 24, 170, 30);
        getContentPane().add(imageLabel);
        imageLabel.setBounds(490, 190, 100, 90);

        button.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        button.setForeground(new java.awt.Color(0, 204, 255));
        button.setText("ccept");
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMouseClicked(evt);
            }
        });
        getContentPane().add(button);
        button.setBounds(710, 20, 100, 30);

        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(640, 10, 0, 40);

        button3.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        button3.setForeground(new java.awt.Color(255, 255, 255));
        button3.setText("A");
        button3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button3MouseClicked(evt);
            }
        });
        getContentPane().add(button3);
        button3.setBounds(690, 20, 30, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalman/ssssd.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 20, 30, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalman/ssssd.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(440, 20, 30, 30);

        button2.setFont(new java.awt.Font("Segoe Print", 3, 24)); // NOI18N
        button2.setForeground(new java.awt.Color(255, 255, 255));
        button2.setText("H");
        button2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        getContentPane().add(button2);
        button2.setBounds(470, 20, 30, 30);

        button1.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        button1.setForeground(new java.awt.Color(0, 204, 255));
        button1.setText("ajj Location");
        button1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button1MouseClicked(evt);
            }
        });
        getContentPane().add(button1);
        button1.setBounds(490, 20, 160, 30);

        name3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        name3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(name3);
        name3.setBounds(170, 160, 280, 20);

        nationality3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        nationality3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(nationality3);
        nationality3.setBounds(210, 240, 240, 20);

        age3.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        age3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(age3);
        age3.setBounds(160, 200, 260, 20);

        Campaign_guide.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        Campaign_guide.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(Campaign_guide);
        Campaign_guide.setBounds(240, 280, 220, 30);

        Accommodation1.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        Accommodation1.setForeground(new java.awt.Color(0, 204, 255));
        Accommodation1.setText("Campaign guide:");
        getContentPane().add(Accommodation1);
        Accommodation1.setBounds(120, 280, 130, 30);

        nationality2.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        nationality2.setForeground(new java.awt.Color(0, 204, 255));
        nationality2.setText("Nationality");
        getContentPane().add(nationality2);
        nationality2.setBounds(120, 240, 120, 20);
        getContentPane().add(imgFrameLabel);
        imgFrameLabel.setBounds(480, 180, 130, 110);

        nationality4.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        nationality4.setForeground(new java.awt.Color(0, 204, 255));
        nationality4.setText("Chronic diseases");
        getContentPane().add(nationality4);
        nationality4.setBounds(120, 320, 160, 30);

        diseases.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        diseases.setForeground(new java.awt.Color(255, 255, 255));
        diseases.setText("No Disease has Recorded");
        getContentPane().add(diseases);
        diseases.setBounds(240, 320, 230, 30);

        nationality.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        nationality.setForeground(new java.awt.Color(0, 204, 255));
        nationality.setText("Age");
        getContentPane().add(nationality);
        nationality.setBounds(120, 200, 90, 20);

        name.setFont(new java.awt.Font("Segoe Print", 3, 14)); // NOI18N
        name.setForeground(new java.awt.Color(0, 204, 255));
        name.setText("Name:");
        getContentPane().add(name);
        name.setBounds(120, 160, 70, 20);

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jLabel1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel1KeyTyped(evt);
            }
        });
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 0, 0);
        getContentPane().add(imageLabel1);
        imageLabel1.setBounds(490, 190, 100, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/medicalman/rsz_a.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 830, 530);

        travel2.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        travel2.setForeground(new java.awt.Color(255, 255, 255));
        travel2.setText("Name:");
        getContentPane().add(travel2);
        travel2.setBounds(250, 310, 210, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public static void currentTime(JLabel time) {
        
        Thread clock = new Thread() {
            @Override
            public void run() {
                for (;;) {
                    Calendar cal = new GregorianCalendar();
                    int second = cal.get(Calendar.SECOND);
                    int minute = cal.get(Calendar.MINUTE);
                    int hour = cal.get(Calendar.HOUR);
                    if (hour == 0) {
                        hour = 12;
                    }
                    time.setText(hour + " : " + minute + " : " + second);
                    try {
                        sleep(1000);
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e.getMessage());
                    }
                }
            }
        };
        clock.start();
    }
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        //        this.setVisible(false);
        //        menu Home = new menu();
        //        //left - up
        //        ImageIcon img = new ImageIcon("C:\\Users\\Hala\\Desktop\\New folder\\icon.png");
        //        Home.setIconImage(img.getImage());
        //        Home.setBounds(255, 100, 825, 526);
        //        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //        Home.setVisible(true);
        //        Home.setResizable(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyPressed
        //        this.setVisible(false);
        //        menu Home = new menu();
        //        //left - up
        //        ImageIcon img = new ImageIcon("C:\\Users\\Hala\\Desktop\\New folder\\icon.png");
        //        Home.setIconImage(img.getImage());
        //        Home.setBounds(255, 100, 825, 526);
        //        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //        Home.setVisible(true);
        //        Home.setResizable(true);
    }//GEN-LAST:event_jLabel1KeyPressed

    private void jLabel1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel1KeyTyped
        //        this.setVisible(false);
        //        menu Home = new menu();
        //        //left - up
        //        ImageIcon img = new ImageIcon("icon.png");
        //        Home.setIconImage(img.getImage());
        //        Home.setBounds(255, 100, 825, 526);
        //        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //        Home.setVisible(true);
        //        Home.setResizable(true);
    }//GEN-LAST:event_jLabel1KeyTyped

    private void buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMouseClicked
        if (button.getText().equals("ccept")) {
            button.setText("one");
            button3.setText("D");
        } else if (button.getText().equals("one")) {
            button.setText("ccept");
            button3.setText("A");
        }
    }//GEN-LAST:event_buttonMouseClicked

    private void button1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button1MouseClicked
        String map_path="file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html";        
        GoogleMap map = new GoogleMap();
        map.path = map_path; 
        map.SetMap();
    }//GEN-LAST:event_button1MouseClicked

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button2MouseClicked

    private void button3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button3MouseClicked
        if (button.getText().equals("ccept")) {
            button.setText("one");
            button3.setText("D");
        } else if (button.getText().equals("one")) {
            button.setText("ccept");
            button3.setText("A");
        }
    }//GEN-LAST:event_button3MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JOptionPane.showMessageDialog(this, "This feature is for future use, It will allow moving to the next request :) ");
    }//GEN-LAST:event_jLabel6MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(medicalManInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(medicalManInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(medicalManInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(medicalManInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new medicalManInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Accommodation1;
    private javax.swing.JLabel Campaign_guide;
    private javax.swing.JLabel age3;
    private javax.swing.JLabel button;
    private javax.swing.JLabel button1;
    private javax.swing.JLabel button2;
    private javax.swing.JLabel button3;
    private javax.swing.JLabel diseases;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel imageLabel1;
    private javax.swing.JLabel imageLabel2;
    private javax.swing.JLabel imgFrameLabel;
    private javax.swing.JLabel imgFrameLabel1;
    private javax.swing.JLabel imgFrameLabel2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel name;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel nationality;
    private javax.swing.JLabel nationality2;
    private javax.swing.JLabel nationality3;
    private javax.swing.JLabel nationality4;
    private javax.swing.JLabel time;
    private javax.swing.JLabel travel2;
    // End of variables declaration//GEN-END:variables
}
