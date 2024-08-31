import java.util.Set;
import java.util.HashSet;
public class Publisher {
    private final Set<Topic> topics;

    public Publisher(){
        this.topics = new HashSet<>();
    }

    public void registerTopic(Topic topic){
        topics.add(topic);
    }
    public void publish(Topic topic, Message message){
        if(!topics.contains(topic)){
            System.out.println("The publisher cannot publish to topic " + topic.getName());
        }
        topic.publish(message);
    }
}
