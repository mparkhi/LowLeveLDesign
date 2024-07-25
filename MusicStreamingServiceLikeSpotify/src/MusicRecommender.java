import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class MusicRecommender {
    private static MusicRecommender instance;
    private final Map<String, List<Song>> userRecommendations;

    private MusicRecommender(){
        userRecommendations = new ConcurrentHashMap<>();
    }

    public static synchronized MusicRecommender getInstance(){
        if(instance == null){
            return new MusicRecommender();
        }
        return instance;
    }
    public List<Song> recommendSongs(User user){
        return userRecommendations.getOrDefault(user.getId(), new ArrayList<>());
    }

}
