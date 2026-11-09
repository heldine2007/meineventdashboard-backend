package webtechprojekt.meineventdashboard;

import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<EventEntry, Long> {
}