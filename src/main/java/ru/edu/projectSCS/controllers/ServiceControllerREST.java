package ru.edu.projectSCS.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.edu.projectSCS.model.Event;
import ru.edu.projectSCS.servise.EventServiceImpl;

import java.util.Optional;


@RestController
@RequestMapping("api/event")
public class ServiceControllerREST {
    @Autowired
    private EventServiceImpl eventService;

    @PostMapping("/createUser")
    public Event createEvent(@RequestBody Event event) {
        return eventService.createEvent(event);
    }

    @GetMapping("/all")
    public Page<Event> getAll(
            @RequestParam(value = "offset", defaultValue = "0") Integer offset,
            @RequestParam(value = "limit", defaultValue = "5") Integer limit,
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<String> sortBy
    ) {
        return eventService.findAll(PageRequest.of(page.orElse(offset), limit, Sort.Direction.ASC, sortBy.orElse("date")
        ));
    }
}

