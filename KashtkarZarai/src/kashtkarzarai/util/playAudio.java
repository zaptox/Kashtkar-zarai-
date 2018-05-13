/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kashtkarzarai.util;

import java.applet.AudioClip;
import javax.swing.JApplet;

/**
 *
 * @author Vksoni
 */
public class playAudio {
    public void playErrorSound() {
     
        AudioClip error = JApplet.newAudioClip(getClass().getResource("/kashtkarzarai/audio/error.wav"));
            error.play();
    }
      public void playSuccessSound() {
     
        AudioClip error = JApplet.newAudioClip(getClass().getResource("/kashtkarzarai/audio/chaching.wav"));
            error.play();
    }
}
