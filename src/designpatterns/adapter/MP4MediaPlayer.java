package designpatterns.adapter;


public class MP4MediaPlayer implements AdvancedMediaPlayer {

    MediaAdepter mediaAdepter;

    MP4MediaPlayer(){super();}
    MP4MediaPlayer(MediaAdepter mediaAdepter){
        this.mediaAdepter=mediaAdepter;
    }

    @Override
    public void play(String mediaFile) {
        System.out.println("Play MP4 media Player :"+mediaFile);
    }
}
