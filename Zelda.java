import javax.swing.JFrame;
import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
class Zelda
{










public static void main(String[] args)
{

  Window GUI  = new Window();

  GUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  GUI.setSize(960, 538);
  GUI.setResizable(false);
  GUI.setVisible(true);
try{
  AudioInputStream ais = AudioSystem.getAudioInputStream(new File("/home/zeo57/Desktop/Zelda/sound.wav"));

  Clip clip = AudioSystem.getClip();
  clip.open(ais);
  for (int i =0 ;i<30000; i++)
  {
      //clip.start();

  }
  for (int i = 0; i <30000; i ++)
  {
    //System.out.println("LOL");
  }}
      catch(Exception e){e.printStackTrace();}




}
}
