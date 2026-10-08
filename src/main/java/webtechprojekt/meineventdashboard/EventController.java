package webtechprojekt.meineventdashboard;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EventController {

    @GetMapping("/")
    public List<EventEntry> index() {
        return List.of(new EventEntry("M1"), new EventEntry("M2"), new EventEntry("M3"), new EventEntry("M4"));
    }

}