import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;

public class BackgroundMusicThread extends Thread {
    private Clip clip;

    public BackgroundMusicThread(String musicFilePath) {
        
    }
    
    @Override
    public void run() {
        try { 
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("/Users/jungjaewook/Protected_world_game/src/AnyConv.com__stranger-things-124008.wav"));
            clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
    public void stopMusic() {
        if (clip != null) {
            clip.stop();
        }
    }
}