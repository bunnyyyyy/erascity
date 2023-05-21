import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class Music extends MyJFrame {

    File musicPath;
    AudioInputStream audioInput;
    Clip clip;

    public Music(String musicLocation) {
        musicPath = new File(musicLocation);
        audioInput = AudioSystem.getAudioInputStream(musicPath);
        clip = AudioSystem.getClip();
        clip.open(audioInput);
    }
    
    public void playMusic() {
        
        clip.start();
    }

    public void setSong(long time) {
        //clip.stop();
        //clip.setMicrosecondPosition(time);
    }
}
