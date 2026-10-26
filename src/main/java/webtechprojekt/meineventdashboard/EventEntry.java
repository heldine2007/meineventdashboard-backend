package webtechprojekt.meineventdashboard;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class EventEntry {

    private String id;
    private String name;
    private String firstDate;
    private String lastDate;
    private String currentTime;
    private float price;
    private float distance;
    private boolean pass;
    private String category;
    private String description;
    private String imageUrl;

    private static final DateTimeFormatter DATE_FORMAT =
            DateTimeFormatter.ofPattern("dd.MM.yyyy");

    private static final DateTimeFormatter TIME_FORMAT =
            DateTimeFormatter.ofPattern("HH:mm");

    public EventEntry(String name) {
        this(
                name,
                LocalDate.now().format(DATE_FORMAT),
                LocalDate.now().format(DATE_FORMAT),
                LocalTime.now().format(TIME_FORMAT),
                0f, 0f, false
        );
    }

    public EventEntry(
            String name,
            String firstDate,
            String lastDate,
            String currentTime,
            float price,
            float distance,
            boolean pass
    ) {
        this.id = name.toLowerCase().replaceAll("[^a-z0-9]+", "-");

        this.name = name;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.currentTime = currentTime;
        this.price = price;
        this.distance = distance;
        this.pass = pass;
        this.category = "Freizeit";
        this.description = "Weitere Informationen folgen.";
        this.imageUrl = "";
    }

    public EventEntry(
            String id,
            String name,
            String firstDate,
            String lastDate,
            String currentTime,
            float price,
            float distance,
            boolean pass,
            String category,
            String description,
            String imageUrl
    )

    {
        this.id = id;
        this.name = name;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.currentTime = currentTime;
        this.price = price;
        this.distance = distance;
        this.pass = pass;
        this.category = category;
        this.description = description;
        this.imageUrl = imageUrl;
    }
}