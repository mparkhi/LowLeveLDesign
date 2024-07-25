public class MusicPlayer {
    private Song currentSong;
    private boolean isPlaying;
    private int currentTime;

    public MusicPlayer(Song currentSong, boolean isPlaying, int currentTime){
        this.currentSong = currentSong;
        this.isPlaying = isPlaying;
        this.currentTime = currentTime;
    }
    public void playSong(Song song){
        song = currentSong;
        isPlaying = true;
        currentTime = 0;
    }
    public void pauseSong(){
        isPlaying = false;
    }

    public void seekTo(int time){
        currentTime = time;
    }
}
