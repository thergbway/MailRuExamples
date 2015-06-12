package events;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EventSource {
    private List<EventListener> listeners = new LinkedList<EventListener>();

    public void addListener(EventListener listener) {
        listeners.add(listener);
    }

    public boolean removeListener(EventListener listener) {
        return listeners.removeAll(Collections.singleton(listener));
    }

    public void fireEvent(Event event) {
        listeners.forEach(listener -> listener.handle(event));
    }
}