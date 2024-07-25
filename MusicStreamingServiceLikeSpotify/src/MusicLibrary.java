import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.ArrayList;
public class MusicLibrary {
    private static MusicLibrary instance;
    private final Map<String, Song> songs;
    private final Map<String, Album> albums;
    private final Map<String, Artist> artists;


    private MusicLibrary(){
        songs = new ConcurrentHashMap<>();
        albums = new ConcurrentHashMap<>();
        artists = new ConcurrentHashMap<>();
    }
    public static synchronized MusicLibrary getInstance(){
        if(instance == null){
            instance = new MusicLibrary();
        }
        return instance;
    }
    public Song getSong(String songId){
        return songs.get(songId);
    }
    public Album getAlbum(String albumId){
        return albums.get(albumId);
    }
    public Artist getArtist(String artistId){
        return artists.get(artistId);
    }

    public void addSong(Song song){
        songs.put(song.getId(), song);
    }
    public void addArtist(Artist artist){
        artists.put(artist.getId(), artist);
        for(Album album : artist.getAlbums()){
            addAlbum(album);
        }
    }
    public void addAlbum(Album album){
        albums.put(album.getId(), album);
        for(Song song : album.getSongs()){
            addSong(song);
        }
    }
}
