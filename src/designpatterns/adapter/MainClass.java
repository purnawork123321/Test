package designpatterns.adapter;

public class MainClass {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer=new AudioMediaPlayer();
        mediaPlayer.play("test.mp3");

        AdvancedMediaPlayer vlcMediaPlayer = new VLCMediaPlayer();
        vlcMediaPlayer.play("test1.vlc");

        AdvancedMediaPlayer mp4MediaPlayer = new MP4MediaPlayer();
        mp4MediaPlayer.play("test2.mp4");

        MediaPlayer mediaPlayerVLC=new AudioMediaPlayer(new MediaAdepter(new VLCMediaPlayer()));
        mediaPlayerVLC.getMediaAdepter().play("test2.vlc");

        MediaPlayer mediaPlayerMP4=new AudioMediaPlayer(new MediaAdepter(new MP4MediaPlayer()));
        mediaPlayerMP4.getMediaAdepter().play("test3.mp4");



    }
}
