public class mp4Tomkv {
File source = new File("source.avi");
File target = new File("target.mkv");
AudioAttributes audio = new AudioAttributes();
audio.setCodec("libmp3lame");
audio.setBitRate(new Integer(64000));
audio.setChannels(new Integer(1));
audio.setSamplingRate(new Integer(22050));
VideoAttributes video = new VideoAttributes();
video.setCodec("mkv");
video.setBitRate(new Integer(160000));
video.setFrameRate(new Integer(15));
video.setSize(new VideoSize(400, 300));
EncodingAttributes attrs = new EncodingAttributes();
attrs.setFormat("mkv");
attrs.setAudioAttributes(audio);
attrs.setVideoAttributes(video);
Encoder encoder = new Encoder();
encoder.encode(source, target, attrs);  
    
}
