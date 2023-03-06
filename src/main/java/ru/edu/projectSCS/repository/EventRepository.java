package ru.edu.projectSCS.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.edu.projectSCS.model.Event;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {

}
