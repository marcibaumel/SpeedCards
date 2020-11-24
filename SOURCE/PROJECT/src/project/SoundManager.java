package project;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.lang.Object;
import javafx.scene.media.AudioClip;
import javax.swing.*;
import java.io.File;
import java.nio.file.Paths;


public class SoundManager {

    private Clip clip;
    private AudioClip audioClip;
    private MediaPlayer mp;
    private Media me;

    public void playMusic(String musicLocation)
    {
        try{
            File musicPath = new File(musicLocation);

            if(musicPath.exists())
            {
                AudioInputStream audioInput= AudioSystem.getAudioInputStream(musicPath);
                clip= AudioSystem.getClip();


                clip.open(audioInput);
                clip.start();
                clip.loop(Clip.LOOP_CONTINUOUSLY);
            }
            else
            {
                System.out.println("Oops, can't find the music");
            }

        }catch(Exception ex){

            ex.printStackTrace();
        }
    }

    public void playCardClip()
    {

    }


    public static int testFunction(){
        return 1;
    }

}
