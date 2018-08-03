/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package medicalman;



import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.WindowConstants;


public class GoogleMap {
    public static String path="";

    /**
     * @param args the command line arguments
     */
    public static void SetMap() {

        Browser browser = new Browser();
        BrowserView view = new BrowserView(browser);
        JFrame frame = new JFrame("JxBrowser Google Maps");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.add(view, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //browser.loadURL("http://maps.google.com");   
        // ############# Every User has its own file - bathe should be in DB ###################
      browser.loadURL(path);
    }

}