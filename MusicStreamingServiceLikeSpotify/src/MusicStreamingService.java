public class MusicStreamingService {
    private final MusicLibrary musicLibrary;
    private final MusicRecommender musicRecommender;
    private final UserManager userManager;

    public MusicStreamingService(){
        musicLibrary = MusicLibrary.getInstance();
        musicRecommender = MusicRecommender.getInstance();
        userManager = UserManager.getInstance();
    }
    public void start(){

    }

    public MusicLibrary getMusicLibrary(){
        return musicLibrary;
    }
    public MusicRecommender getMusicRecommender(){
        return musicRecommender;
    }
    public UserManager getUserManager(){
        return userManager;
    }
}
