public class PubSubDemo {
    public static void run(){
        // create topics
        Topic topic1 = new Topic("Topic1");
        Topic topic2 = new Topic("Topic2");

        // create publishers
        Publisher publisher1 = new Publisher();
        Publisher publisher2 = new Publisher();

        // create subscribers

        Subscriber subscriber1 = new PrintSubscriber("Subscriber1");
        Subscriber subscriber2 = new PrintSubscriber("Subscriber2");
        Subscriber subscriber3 = new PrintSubscriber("Subscriber3");

        // publish messages

        publisher1.publish(topic1, new Message("Message 1 for topic 1"));
        publisher1.publish(topic1, new Message("Message 2 for topic 1"));
        publisher1.publish(topic2, new Message("Message 1 for topic 2"));

        // add subscriber to a topic
         topic2.addSubscriber(new PrintSubscriber("Subscriber 4"));

        // Unsubscribe from a topic
        topic1.removeSubscriber(subscriber2);

        // Publish more messages
        publisher1.publish(topic1, new Message("Message 3 for topic 1"));
        publisher1.publish(topic2, new Message("Message 2 for topic 2"));




    }
}
