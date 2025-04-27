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
@Table(name = "descendant_one")
@SequenceGenerator(name = "entity_generator", sequenceName = "descendant_one_id_seq", allocationSize = 1)
public class DescendantOne extends AbstractDatabaseEntity {
    @Version
    private Integer version;
    private String name;
}