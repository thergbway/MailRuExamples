package events;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        EventSource source = new EventSource();
        source.addListener(event -> System.out.println("Listener 1 got event: " + event.getMessage()));
        source.addListener(event -> System.out.println("Listener 2 got event: " + event.getMessage()));
        source.addListener(event -> System.out.println("Listener 3 got event: " + event.getMessage()));

        source.fireEvent(new Event("event1 message"));

        Thread.sleep(2000L);

        source.fireEvent(new Event("event2 message"));

    }
}
