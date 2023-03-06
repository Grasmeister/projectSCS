package ru.edu.projectSCS.model;

import lombok.Getter;
import lombok.Setter;
import ru.edu.projectSCS.enums.ClassifierEnum;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "event")
public class Event {

    @Id
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "classifier")
    @Enumerated(EnumType.STRING)
    private ClassifierEnum classifier;

    @Column(name = "date")
    private Timestamp date;

}
