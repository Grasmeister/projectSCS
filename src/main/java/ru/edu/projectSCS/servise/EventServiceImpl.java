package ru.edu.projectSCS.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.edu.projectSCS.model.Event;
import ru.edu.projectSCS.repository.EventRepository;

@Service
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        Event draft = new Event();
        draft.setId(event.getId());
        draft.setName(event.getName());
        draft.setDescription(event.getDescription());
        draft.setClassifier(event.getClassifier());
        draft.setDate(event.getDate());
        return eventRepository.save(draft);
    }

    @Override
    public Page<Event> findAll(Pageable pageable) {
        return eventRepository.findAll(pageable);
    }

}
