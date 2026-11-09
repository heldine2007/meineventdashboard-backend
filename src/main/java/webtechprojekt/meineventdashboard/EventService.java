package webtechprojekt.meineventdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    @Autowired
    EventRepository repo;

    public EventEntry save(EventEntry event) {
        return repo.save(event);
    }

    public EventEntry get(Long id) {
        return repo.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<EventEntry> getAllEvents() {
        Iterable<EventEntry> iterator = repo.findAll();

        List<EventEntry> events = new ArrayList<>();

        for (EventEntry event : iterator) {
            events.add(event);
        }

        return events;
    }
}