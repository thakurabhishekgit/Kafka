
public class consumerMessage {
    // Add your implementation here

    @KafkaListener(topics = "my-topic")
    public String getMessage(String message) {
        System.out.println("Received message: " + message);
    }
}
