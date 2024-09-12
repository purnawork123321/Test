package designpatterns.adapter;

public class VLCMediaPlayer implements AdvancedMediaPlayer {
    @Override
    public void play(String mediaFile) {
        System.out.println("Play VLC media Player :"+mediaFile);
    }
}
