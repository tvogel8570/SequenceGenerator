package com.vogelware.sequencegenerator.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "descendant_two")
public class DescendantTwo extends AbstractDatabaseEntity {
    @SequenceGenerator(name = "entity_generator", sequenceName = "descendant_two_id_seq", allocationSize = 1)
    public Long getId() {
        return id;
    }

    @Version
    private Integer version;
    private String model;
}