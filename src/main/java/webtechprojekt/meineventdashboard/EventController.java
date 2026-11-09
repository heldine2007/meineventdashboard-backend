package webtechprojekt.meineventdashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    EventService service;

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://meineventdashboard-frontend.onrender.com"
    })
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public EventEntry createEvent(@RequestBody EventEntry event) {

        event.setDatabaseId(null);

        if (event.getName() == null || event.getName().isBlank()) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Der Eventname ist erforderlich."
            );
        }

        if (event.getId() == null || event.getId().isBlank()) {
            event.setId(event.getName().toLowerCase()
                    .replaceAll("[^a-z0-9]+", "-"));
        }

        return service.save(event);
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://meineventdashboard-frontend.onrender.com"
    })
    @GetMapping("/{id}")
    public EventEntry getEvent(@PathVariable Long id) {
        return service.get(id);
    }

    @CrossOrigin(origins = {
            "http://localhost:5173",
            "https://meineventdashboard-frontend.onrender.com"
    })
    @GetMapping
    public List<EventEntry> getAllEvents() {
        return service.getAllEvents();
    }
}