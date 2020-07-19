/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplemediaconvertor;

import it.sauronsoftware.jave.AudioAttributes;
import it.sauronsoftware.jave.Encoder;
import it.sauronsoftware.jave.EncoderException;
import it.sauronsoftware.jave.EncodingAttributes;
import it.sauronsoftware.jave.InputFormatException;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;



public class mp4Tomkv extends ConversionType{  
        @Override  
         public void getType(){  
             type="B"; 
            try {
                convertToMKV();
            } catch (IllegalArgumentException | EncoderException ex) {
                Logger.getLogger(mp4Tomp3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }  
            Convertor conv = new Convertor();
            File video;
        
	public  void convertToMKV() throws IllegalArgumentException, InputFormatException, EncoderException
	{
                video = new File(conv.Mpath);
		File target = new File(conv.MpathSave);
		AudioAttributes audio = new AudioAttributes();
		audio.setCodec("libmkvlame");
		audio.setBitRate(new Integer(128000));
		audio.setChannels(new Integer(2));
		audio.setSamplingRate(new Integer(44100));
		EncodingAttributes attrs = new EncodingAttributes();
		attrs.setFormat("mkv");
		attrs.setAudioAttributes(audio);
		Encoder encoder = new Encoder();
		encoder.encode(video, target, attrs);
	}
   }
