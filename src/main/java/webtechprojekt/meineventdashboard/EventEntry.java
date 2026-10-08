package webtechprojekt.meineventdashboard;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Setter
@Getter
public class EventEntry {

    private String name;
    private String firstDate;
    private String lastDate;
    private long price;
    private int distance;
    private boolean pass;

    public EventEntry(String name) {
        this.name = name;
        this.firstDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.lastDate = LocalDate.now().format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        this.price = 0;
        this.distance = 0;
    }

}