package com.knoldus.config;

import org.axonframework.eventsourcing.EventCountSnapshotTriggerDefinition;
import org.axonframework.eventsourcing.SnapshotTriggerDefinition;
import org.axonframework.eventsourcing.Snapshotter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SnapshotConfig {


    @Bean
    public SnapshotTriggerDefinition
    AggregateSnapshotTrigger(Snapshotter snapshotter) {
        System.out.println("/////"+snapshotter.getClass().getName());
        return new EventCountSnapshotTriggerDefinition(snapshotter, 1);
    }

}
