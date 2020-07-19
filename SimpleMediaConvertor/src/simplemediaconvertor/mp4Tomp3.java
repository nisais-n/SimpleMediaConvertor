/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemediaconvertor;
/**
 *
 * @author User Nisais N
 */

import java.io.File;
import java.io.IOException;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException; 
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.FFMPEGLocator;
import it.sauronsoftware.jave.InputFormatException;
import java.util.logging.Level;
import java.util.logging.Logger;


abstract class  mp4Tomp3 extends ConversionType{  
        @Override  
         public void getType(){  
             type="A"; 
            try {
                convertToMP3();
            } catch (IllegalArgumentException ex) {
                Logger.getLogger(mp4Tomp3.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EncoderException ex) {
                Logger.getLogger(mp4Tomp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
            public String path = FileSourcePath;
            public String pathSave = FileSavePath;
            File video;
        
	public  void convertToMP3() throws IllegalArgumentException, InputFormatException, EncoderException
	{
                video = new File(path);
		File target = new File(pathSave);
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmp3lame");
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mp3");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		encoder.encode(video, target, attrs);
	}
   }
