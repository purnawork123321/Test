package designpatterns.adapter;

public class MediaAdepter {
    AdvancedMediaPlayer advancedMediaPlayer;
    MediaAdepter(AdvancedMediaPlayer advancedMediaPlayer){
        this.advancedMediaPlayer=advancedMediaPlayer;
    }
    void play(String mediaFile){
        advancedMediaPlayer.play(mediaFile);
    }

}
