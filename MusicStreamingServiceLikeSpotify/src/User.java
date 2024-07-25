import java.util.List;
import java.util.ArrayList;
public class User {
    private final String id;
    private final String username;
    private final String password;
    private final List<Playlist> playlists;

    public User(String id, String username, String password){
        this.id = id;
        this.username = username;
        this.password = password;
        this.playlists = new ArrayList<Playlist>();
    }
    public String getId(){
        return id;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }

    public List<Playlist> getPlaylists() {
        return playlists;
    }

    public List<Playlist> addPlaylist(Playlist playlist){
        playlists.add(playlist);
    }
    public List<Playlist> removePlaylist(Playlist playlist){
        playlists.remove(playlist);
    }
}
