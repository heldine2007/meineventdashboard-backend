package webtechprojekt.meineventdashboard;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "events")
@Getter
@Setter
@NoArgsConstructor
public class EventEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long databaseId;

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

    public EventEntry(String name) {
        this.name = name;
    }

    public EventEntry(String name, String firstDate, String lastDate,
                      String currentTime, float price, float distance,
                      boolean pass) {
        this.name = name;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.currentTime = currentTime;
        this.price = price;
        this.distance = distance;
        this.pass = pass;
    }

    public EventEntry(String id, String name, String firstDate,
                      String lastDate, String currentTime, float price,
                      float distance, boolean pass, String category,
                      String description, String imageUrl) {
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