package back;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import java.io.File;
import java.io.FileNotFoundException;

public class ReproducirMusica {
    private Clip clip;
    public ReproducirMusica(){}
    public void cargarSonido(String ruta){
        try (AudioInputStream audioInputStream= AudioSystem.getAudioInputStream(new File(ruta))){
            clip=AudioSystem.getClip();
            clip.open(audioInputStream);
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void reproducirSonidoEnBucle(){
        reproducirSonido();
        clip.loop(Clip.LOOP_CONTINUOUSLY);
    }
    public void reproducirSonido(){
        if(clip!=null){
            clip.setFramePosition(0);
            clip.start();
        }
    }
    public void detenerSonido(){if(clip!=null&&clip.isRunning())clip.stop();}

}
