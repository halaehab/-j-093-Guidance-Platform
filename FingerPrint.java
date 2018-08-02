package fingerprint;

import GUI.HomePage;
import java.sql.ResultSet;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class FingerPrint extends Application {

    public static String lang = null;
    public static String fromLang = "en";
    public static String hajjName = null;

    public static connection c = new connection();

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Menus.fxml"));

        Scene scene = new Scene(root);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) throws Exception {
        Application.launch(args);

        ResultSet result = connection.setQuery("SELECT language from hajj_info where id = '" + MenusController.DB_ID + "'");
        while (result.next()) {

            lang = result.getString("language");

        }
        ResultSet result2 = connection.setQuery("SELECT name from hajj_info where id = '" + MenusController.DB_ID + "'");
        while (result2.next()) {

            hajjName = result2.getString("name");

        }

        //###########################################First GuI###########################################
        HomePage Home = new HomePage();
        System.out.println("xxxxxxxxxxxxxx111111111");

    }

}
