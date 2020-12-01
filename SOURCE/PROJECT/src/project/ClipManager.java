package project;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;

public class ClipManager {

    private Clip clip;
    private AudioClip audioClip;
    private MediaPlayer mp;
    private Media me;

    public void playClip(String musicLocation)
    {
        try{
            File musicPath = new File(musicLocation);

            if(musicPath.exists())
            {
                AudioInputStream audioInput= AudioSystem.getAudioInputStream(musicPath);
                clip= AudioSystem.getClip();


                clip.open(audioInput);
                clip.start();
                //clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else
            {
                System.out.println("Oops, can't find the clip");
            }

        }catch(Exception ex){

            ex.printStackTrace();
        }
    }

    public boolean exsistingSound(String musicLocation)
    {

        try {
            File musicPath = new File(musicLocation);

            if (musicPath.exists()) {
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);


            } else {
                return false;
            }

        } catch (Exception ex) {

            ex.printStackTrace();
            return false;
        }

        return true;
    }





}
