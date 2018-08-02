package GUI;

import static fingerprint.FingerPrint.fromLang;
import static fingerprint.FingerPrint.hajjName;
import static fingerprint.FingerPrint.lang;
import fingerprint.GoogleMap;
import fingerprint.MenusController;
import fingerprint.Translator;
import fingerprint.Trying_Different_Languages;
import fingerprint.connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Hala
 */
public class HomePage extends javax.swing.JFrame {
    
    public static boolean flagWindow = true;
    
    public HomePage() {
        initComponents();
        noLight();
//        yellowLight.setVisible(false);
//        red_light.setVisible(false);
//        green_Light.setVisible(false);
//        blue_Light.setVisible(false);
//waitPanel.setVisible(false);
        ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Desktop\\Hajj\\Hajj\\src\\icon.png");
        this.setIconImage(img.getImage());
        this.setBounds(255, 100, 825, 526);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        if (flagWindow) {
            try {
//                String S1;
                String S1, S2, S3, S4;
//                String S1_t;
                String S1_t, S2_t, S3_t, S4_t;
                Translator http = new Translator();
                Trying_Different_Languages speakClass = new Trying_Different_Languages();
                // S1 = "Please, press the blue button if you need a map guidance, If you need a medical assistance, please press the red button, If you need help from a volunteer guide, press the green button, If you need the contact info for your combine guide, please press the yellow button";
                S1 = "Please, press the white button if you need a map guidance,";
                S2 = "If you need a medical assistance, please press the red button,";
                S3 = "If you need help from a volunteer guide, press the green button,";
                S4 = "If you need the contact info for your combine guide, please press the yellow button";

                //###########################################For translating Buttons###########################################
                mappButton.setText(http.callUrlAndParseResult(fromLang, lang, "Map"));
                midicalButton.setText(http.callUrlAndParseResult(fromLang, lang, "medical assistant"));
                volunteerButton.setText(http.callUrlAndParseResult(fromLang, lang, "volunteer"));
                infoButton.setText(http.callUrlAndParseResult(fromLang, lang, "my information"));
                this.setVisible(true);
                //###########################################For translating speaking###########################################
                S1_t = http.callUrlAndParseResult(fromLang, lang, S1);
                S2_t = http.callUrlAndParseResult(fromLang, lang, S2);
                S3_t = http.callUrlAndParseResult(fromLang, lang, S3);
                S4_t = http.callUrlAndParseResult(fromLang, lang, S4);
                //###########################################For speaking###########################################

//                MY IDEA IS MAKING A THREAD FOR TRANSLATING AND REED THE FIRST SENTENCE THEN CHANGE THE BUTTON COLOR ..EXT.
                speakClass.speak("Hajj " + hajjName);
                noLight();
                returnAll();
                map1.setVisible(false);
                map2.setVisible(true);
                map3.setVisible(true);
                speakClass.speak(S1_t);
                
                noLight();
                returnAll();
                medical1.setVisible(false);
                medical3.setVisible(true);
                medical4.setVisible(true);
                speakClass.speak(S2_t);
                
                noLight();
                returnAll();
                volanteer1.setVisible(false);
                volanteer2.setVisible(true);
                volanteer3.setVisible(true);
                speakClass.speak(S3_t);
                
                noLight();
                returnAll();
                myInfo1.setVisible(false);
                personalInfo2.setVisible(true);
                personalInfo3.setVisible(true);
                speakClass.speak(S4_t);
            } catch (Exception ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

//        madina2.setVisible(false);
//        madina22.setVisible(false);
//
//        makkah2.setVisible(false);
//        makkah22.setVisible(false);
//
//        arafa2.setVisible(false);
//        arafa22.setVisible(false);
//
//        mozd2.setVisible(false);
//        mozd22.setVisible(false);
//
//        mina2.setVisible(false);
//        mina22.setVisible(false);
//
//        madinaPanel.setVisible(false);
        //waitPanel.setVisible(false);
        flagWindow = false;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        personalInfo2 = new javax.swing.JLabel();
        personalInfo3 = new javax.swing.JLabel();
        volanteer3 = new javax.swing.JLabel();
        medical4 = new javax.swing.JLabel();
        map3 = new javax.swing.JLabel();
        medical3 = new javax.swing.JLabel();
        volanteer2 = new javax.swing.JLabel();
        map2 = new javax.swing.JLabel();
        infoButton = new javax.swing.JButton();
        myInfo1 = new javax.swing.JLabel();
        map1 = new javax.swing.JLabel();
        volunteerButton = new javax.swing.JButton();
        medical1 = new javax.swing.JLabel();
        volanteer1 = new javax.swing.JLabel();
        midicalButton = new javax.swing.JButton();
        mappButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        personalInfo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/yellowPersonal.png"))); // NOI18N
        getContentPane().add(personalInfo2);
        personalInfo2.setBounds(530, 260, 180, 190);

        personalInfo3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/yellowPersonal.png"))); // NOI18N
        getContentPane().add(personalInfo3);
        personalInfo3.setBounds(530, 260, 180, 190);

        volanteer3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/greenVolanteer.png"))); // NOI18N
        volanteer3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volanteer3MouseClicked(evt);
            }
        });
        getContentPane().add(volanteer3);
        volanteer3.setBounds(130, 260, 180, 190);

        medical4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/redMedical.png"))); // NOI18N
        medical4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medical4MouseClicked(evt);
            }
        });
        getContentPane().add(medical4);
        medical4.setBounds(520, 30, 180, 190);

        map3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/whiteMap.png"))); // NOI18N
        map3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                map3MouseClicked(evt);
            }
        });
        getContentPane().add(map3);
        map3.setBounds(130, 30, 180, 190);

        medical3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/redMedical.png"))); // NOI18N
        medical3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medical3MouseClicked(evt);
            }
        });
        getContentPane().add(medical3);
        medical3.setBounds(520, 30, 180, 190);

        volanteer2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/greenVolanteer.png"))); // NOI18N
        volanteer2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volanteer2MouseClicked(evt);
            }
        });
        getContentPane().add(volanteer2);
        volanteer2.setBounds(130, 260, 180, 190);

        map2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/whiteMap.png"))); // NOI18N
        map2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                map2MouseClicked(evt);
            }
        });
        getContentPane().add(map2);
        map2.setBounds(130, 30, 180, 190);

        infoButton.setBackground(new java.awt.Color(0, 0, 0));
        infoButton.setForeground(new java.awt.Color(255, 255, 255));
        infoButton.setText("MY INFORMATION");
        infoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoButtonActionPerformed(evt);
            }
        });
        getContentPane().add(infoButton);
        infoButton.setBounds(420, 440, 340, 30);

        myInfo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/personalInfoIcon.png"))); // NOI18N
        getContentPane().add(myInfo1);
        myInfo1.setBounds(530, 280, 170, 150);

        map1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/mapIcon.png"))); // NOI18N
        map1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                map1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                map1MouseEntered(evt);
            }
        });
        getContentPane().add(map1);
        map1.setBounds(130, 50, 170, 150);

        volunteerButton.setBackground(new java.awt.Color(0, 0, 0));
        volunteerButton.setForeground(new java.awt.Color(255, 255, 255));
        volunteerButton.setText("VOLUNTEER");
        volunteerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volunteerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(volunteerButton);
        volunteerButton.setBounds(60, 440, 340, 30);

        medical1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/medicalIcon.png"))); // NOI18N
        medical1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                medical1MouseClicked(evt);
            }
        });
        getContentPane().add(medical1);
        medical1.setBounds(520, 50, 170, 150);

        volanteer1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/volnteerIcon.png"))); // NOI18N
        volanteer1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volanteer1MouseClicked(evt);
            }
        });
        getContentPane().add(volanteer1);
        volanteer1.setBounds(130, 280, 170, 150);

        midicalButton.setBackground(new java.awt.Color(0, 0, 0));
        midicalButton.setForeground(new java.awt.Color(255, 255, 255));
        midicalButton.setText("MEDICAL ASSISTANT");
        midicalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                midicalButtonActionPerformed(evt);
            }
        });
        getContentPane().add(midicalButton);
        midicalButton.setBounds(420, 230, 340, 30);

        mappButton.setBackground(new java.awt.Color(0, 0, 0));
        mappButton.setForeground(new java.awt.Color(255, 255, 255));
        mappButton.setText("MAP");
        mappButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mappButtonActionPerformed(evt);
            }
        });
        getContentPane().add(mappButton);
        mappButton.setBounds(60, 230, 340, 30);

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 20, 40, 40);

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
        jLabel1.setBounds(0, 0, 980, 0);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/rsz_g.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 830, 530);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(410, 140, 34, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void noLight() {
        map2.setVisible(false);
        map3.setVisible(false);
        
        medical3.setVisible(false);
        medical4.setVisible(false);
        
        volanteer2.setVisible(false);
        volanteer3.setVisible(false);
        
        personalInfo2.setVisible(false);
        personalInfo3.setVisible(false);
    }
private void returnAll(){
    map1.setVisible(true);
    medical1.setVisible(true);
    volanteer1.setVisible(true);
    myInfo1.setVisible(true);
}
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

    private void mappButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mappButtonActionPerformed
        this.setVisible(false);
        String map_path = null;
        ResultSet result3 = connection.setQuery("SELECT makkah_hotel_location from campaign_info where hajj_id = '" + MenusController.DB_ID + "'");
        try {
            while (result3.next()) {
                
                map_path = result3.getString("makkah_hotel_location");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GoogleMap map = new GoogleMap();
        map.path = map_path;
        System.out.println("DDDDDDDDDDDD " + map.path);
        map.SetMap();
    }//GEN-LAST:event_mappButtonActionPerformed

    private void midicalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_midicalButtonActionPerformed
//        waitPanel.setVisible(true);
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

//        madina1.setVisible(false);
//        madina2.setVisible(false);
//
//        makkah1.setVisible(false);
//        makkah2.setVisible(false);
//
//        arafa1.setVisible(false);
//        arafa2.setVisible(false);
//
//        mozd1.setVisible(false);
//        mozd2.setVisible(false);
//
//        mina1.setVisible(false);
//        mina2.setVisible(false);
    }//GEN-LAST:event_midicalButtonActionPerformed

    private void volunteerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volunteerButtonActionPerformed
        // waitPanel.setVisible(true);
String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }

//        madina1.setVisible(false);
//        madina2.setVisible(false);
//
//        makkah1.setVisible(false);
//        makkah2.setVisible(false);
//
//        arafa1.setVisible(false);
//        arafa2.setVisible(false);
//
//        mozd1.setVisible(false);
//        mozd2.setVisible(false);
//
//        mina1.setVisible(false);
//        mina2.setVisible(false);
    }//GEN-LAST:event_volunteerButtonActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void infoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoButtonActionPerformed
        this.setVisible(false);
        myInfo Home = new myInfo();
        //left - up
        //  ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Desktop\\Hajj\\Hajj\\src\\icon.png");
        // Home.setIconImage(img.getImage());
        Home.setBounds(255, 100, 825, 526);
        Home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Home.setVisible(true);
        Home.setResizable(false);
    }//GEN-LAST:event_infoButtonActionPerformed

    private void map3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_map3MouseClicked
        this.setVisible(false);
        String map_path = null;
        ResultSet result3 = connection.setQuery("SELECT makkah_hotel_location from campaign_info where hajj_id = '" + MenusController.DB_ID + "'");
        try {
            while (result3.next()) {
                
                map_path = result3.getString("makkah_hotel_location");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GoogleMap map = new GoogleMap();
        map.path = map_path;
        System.out.println("DDDDDDDDDDDD " + map.path);
        map.SetMap();
    }//GEN-LAST:event_map3MouseClicked

    private void map2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_map2MouseClicked
        this.setVisible(false);
        String map_path = null;
        ResultSet result3 = connection.setQuery("SELECT makkah_hotel_location from campaign_info where hajj_id = '" + MenusController.DB_ID + "'");
        try {
            while (result3.next()) {
                
                map_path = result3.getString("makkah_hotel_location");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GoogleMap map = new GoogleMap();
        map.path = map_path;
        System.out.println("DDDDDDDDDDDD " + map.path);
        map.SetMap();
    }//GEN-LAST:event_map2MouseClicked

    private void map1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_map1MouseClicked
      this.setVisible(false);
        String map_path = null;
        ResultSet result3 = connection.setQuery("SELECT makkah_hotel_location from campaign_info where hajj_id = '" + MenusController.DB_ID + "'");
        try {
            while (result3.next()) {
                
                map_path = result3.getString("makkah_hotel_location");
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
        GoogleMap map = new GoogleMap();
        map.path = map_path;
        System.out.println("DDDDDDDDDDDD " + map.path);
        map.SetMap();
    }//GEN-LAST:event_map1MouseClicked

    private void map1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_map1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_map1MouseEntered

    private void medical1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medical1MouseClicked
        //        waitPanel.setVisible(true);
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_medical1MouseClicked

    private void medical4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medical4MouseClicked
        //        waitPanel.setVisible(true);
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_medical4MouseClicked

    private void medical3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_medical3MouseClicked
       //        waitPanel.setVisible(true);
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_medical3MouseClicked

    private void volanteer3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volanteer3MouseClicked
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_volanteer3MouseClicked

    private void volanteer2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volanteer2MouseClicked
        String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_volanteer2MouseClicked

    private void volanteer1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volanteer1MouseClicked
       String sql = "Insert into notification ( hajj_id,type,location) "
                + "values (?,?,?)";
        PreparedStatement pre;
        try {
            pre = connection.connection.prepareStatement(sql);
            pre.setInt(1, MenusController.DB_ID);
            pre.setString(2, "m");
            pre.setString(3, "file:///C:/Users/Hala/Desktop/New%20folder/FingerPrint/maps/defult.html");
            pre.execute();
        } catch (SQLException ex) {
            Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_volanteer1MouseClicked

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
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomePage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomePage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton infoButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel map1;
    private javax.swing.JLabel map2;
    private javax.swing.JLabel map3;
    private javax.swing.JButton mappButton;
    private javax.swing.JLabel medical1;
    private javax.swing.JLabel medical3;
    private javax.swing.JLabel medical4;
    private javax.swing.JButton midicalButton;
    private javax.swing.JLabel myInfo1;
    private javax.swing.JLabel personalInfo2;
    private javax.swing.JLabel personalInfo3;
    private javax.swing.JLabel volanteer1;
    private javax.swing.JLabel volanteer2;
    private javax.swing.JLabel volanteer3;
    private javax.swing.JButton volunteerButton;
    // End of variables declaration//GEN-END:variables
}
