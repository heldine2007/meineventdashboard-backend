package webtechprojekt.meineventdashboard;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class EventController {

    @GetMapping("/")
    public List<EventEntry> getEvents() {
        return List.of(
                new EventEntry(
                        "festival-of-lights",
                        "Festival of Lights Berlin",
                        "16.10.2026", "18.10.2026",
                        "19:00", 0f, 4.5f, false,
                        "Festival",
                        "Entdecke illuminierte Sehenswürdigkeiten, kreative Lichtkunst "
                                + "und faszinierende Projektionen in ganz Berlin.",
                        "https://www.kurierverlag.de/assets/images/44/327/44327859-teaser-berliner-dom-im-festival-of-lights-2026-le9.jpg"
                ),
                new EventEntry(
                        "herbst-rummel",
                        "Berliner Herbst Rummel",
                        "24.10.2026", "25.10.2026",
                        "14:00", 13f, 13f, false,
                        "Freizeit",
                        "Ein herbstlicher Rummel mit über 80 Fahrgeschäften, "
                                + "und typischen Jahrmarkt-Snacks.",
                        "https://volksfest-berlin.de/wp-content/uploads/2017/03/melodie-star1.jpg"
                ),
                new EventEntry(
                        "comedy-abend",
                        "Comedy-Abend",
                        "20.10.2026", "20.10.2026",
                        "20:00", 22f, 3.7f, false,
                        "Comedy",
                        "Ein unterhaltsamer Abend mit Stand-up-Comedy. "
                                + "Perfekt, wenn du mit Freunden lachen möchtest.",
                        "https://quatsch-comedy-club.de/wp-content/uploads/2025/01/quatsch-comedy-club-vorschau-video-liveshow.jpg"
                ),
                new EventEntry(
                        "kunstmesse",
                        "POSITIONS Berlin Art Fair",
                        "10.09.2026", "13.09.2026",
                        "17:00", 9f, 2.6f, true,
                        "Kunst",
                        "Entdecke zeitgenössische und moderne Kunst "
                                + "von internationalen Galerien. ",
                        "https://www.visitberlin.de/system/files/styles/visitberlin_gallery_item_visitberlin_mobile_1x/private/datahub/images/e_27ffd86920ddd20865d1d65f4cbc4b68_img-hopop.jpg.jpg?itok=QJe8H0cU"
                ),
                new EventEntry(
                        "live-musik",
                        "Live-Musik im Park",
                        "30.10.2026", "30.10.2026",
                        "17:30", 7f, 5.5f, false,
                        "Konzert",
                        "Ein entspannter Musikabend unter freiem Himmel "
                                + "mit Live-Auftritten und gemütlicher Atmosphäre.",
                        "https://www.berlin.de/imgscale4/rbig2zu1/kunst-und-kultur-neukoelln/_assets/fotos/veranstaltung/2025_rudow-quer-mit-bastianss-family.jpg"
                ),
                new EventEntry(
                        "food-festival",
                        "Street-Food-Festival",
                        "07.11.2026", "08.11.2026",
                        "12:00", 5f, 6.2f, false,
                        "Essen",
                        "Probiere verschiedene Street-Food-Gerichte "
                                + "und entdecke neue Geschmacksrichtungen.",
                        "https://www.pankow-weissensee-prenzlauerberg.berlin/system/files/styles/visitberlin_content_image_medium_visitberlin_mobile_1x/private/image/streetfood_0.jpg?itok=6Xm5LJ5p"
                ),
                new EventEntry(
                        "jazz-konzert",
                        "Jazz Night",
                        "14.11.2026", "14.11.2026",
                        "19:30", 18f, 4.1f, false,
                        "Konzert",
                        "Ein Konzertabend mit Jazz, entspannter "
                                + "Atmosphäre und Live-Musik.",
                        "https://res.eventfrog.net/production_res_public/konzert-jazz-ZQB7OVD5-0RKC99PX.webp?_=1783397177000"
                ),
                new EventEntry(
                        "fotografie-ausstellung",
                        "Fotografie-Ausstellung - Im Rhythmus der Großstadt – 100 Jahre Fotografie und Presse in Berlin",
                        "12.06.2026", "20.12.2026",
                        "10:00", 0f, 3.0f, true,
                        "Kunst",
                        "Ein spannender visueller Streifzug durch "
                                + "ein Jahrhundert Berliner Pressefotografie, "
                                + "von der Weimarer Republik bis hin zu zeitgenössischen Werken "
                                + "der Agentur Ostkreuz.",
                        "https://staatsbibliothek-berlin.de/fileadmin/user_upload/zentrale_Seiten/presse-downloads/Rhythmus_der_Gro%C3%9Fstadt/20260608_8274.jpg"
                ),
                new EventEntry(
                        "grand-show",
                        "Grand Show „BLINDED by DELIGHT“",
                        "20.10.2026", "03.07.2027",
                        "19:30", 64.44f, 3.2f, false,
                        "Grand Show",
                        "Erlebe einen abwechslungsreichen Show-Spektakel "
                                + "mit internationaler Akrobatik und glamouröse Haute-Couture-Kostüme.",
                        "https://www.palast.berlin/wp-content/uploads/2024/11/2025-04-29-bbd-logoleiste-1080x1080px.jpg"
                )
        );
    }
}