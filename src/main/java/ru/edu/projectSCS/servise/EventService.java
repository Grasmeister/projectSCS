package ru.edu.projectSCS.servise;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ru.edu.projectSCS.model.Event;

public interface EventService {

    Event createEvent(final Event event);

    Page<Event> findAll(Pageable pageable);
}
