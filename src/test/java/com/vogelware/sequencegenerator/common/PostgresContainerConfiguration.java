package com.vogelware.sequencegenerator.common;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;

@TestConfiguration(proxyBeanMethods = false)
class PostgresContainerConfiguration {

    private static final String POSTGRES_CONTAINER_TAG = "latest";

    @Bean
    @ServiceConnection
    PostgreSQLContainer<?> postgreSQLContainer() {
        var container = new PostgreSQLContainer<>("postgres:" + POSTGRES_CONTAINER_TAG);
        container.withReuse(true);

        return container;
    }
}
