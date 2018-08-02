package fingerprint;

import java.io.IOException;

import com.darkprograms.speech.synthesiser.SynthesiserV2;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;

public class Trying_Different_Languages {

    SynthesiserV2 synthesizer = new SynthesiserV2("AIzaSyBOti4mM-6x9WDnZIjIeyEU21OpBXqWBgw");

    public Trying_Different_Languages() {

        //Let's speak in English
//        speak("Hello Dear Friend !");
        //Let's Speak in Polish
//        speak("MogÄ™ mÃ³wiÄ‡ dowolnym jÄ™zykiem, ktÃ³rego chcesz!");
//speak("Hallo lieber Freund!");//german
//speak("Hola estimat amic!"); //catalan
//speak("Chào anh b?n!"); //Vietnamese
//speak ("¡Hola querido amigo!"); //spanish
//speak("Sveiki, m??ais drugs!"); //Latvian
//speak("Bonjour cher ami"); // france
    }

    /**
     * Calls the MaryTTS to say the given text
     *
     * @param text
     */
    public void speak(String text) {
        System.out.println(text);
//        Thread thread = new Thread(() -> {
        try {

            AdvancedPlayer player = new AdvancedPlayer(synthesizer.getMP3Data(text));
            player.play();

            System.out.println("Successfully got back synthesizer data");

        } catch (IOException | JavaLayerException e) {

            e.printStackTrace();

        }
//        });
//
//      
//        thread.setDaemon(false);
//
//
//        thread.start();

    }
//
//    public static void main(String[] args) {
//        new Trying_Different_Languages();
//    }

}
