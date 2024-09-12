package designpatterns.adapter;

public class AudioMediaPlayer   implements MediaPlayer {

    MediaAdepter mediaAdepter;

    AudioMediaPlayer(){super();}
    AudioMediaPlayer(MediaAdepter mediaAdepter){
        this.mediaAdepter=mediaAdepter;
    }

    @Override
    public void play(String mediaFile) {
        System.out.println("Play audio media Player :"+mediaFile);
    }

    public MediaAdepter getMediaAdepter() {
        return mediaAdepter;
    }
}
