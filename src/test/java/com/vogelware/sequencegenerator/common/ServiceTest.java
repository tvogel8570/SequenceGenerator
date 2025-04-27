package com.vogelware.sequencegenerator.common;

import org.springframework.boot.autoconfigure.validation.ValidationAutoConfiguration;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.lang.annotation.*;

/**
 * Custom composed test annotation used to simplify JPA + service-layer integration testing.
 * Designed to work with Testcontainers and a Spring Boot + Keycloak-based architecture.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@DataJpaTest(
        // Customising what Spring beans are included in the test context.
        includeFilters = {
                // Include @Service beans by annotation (not covered by default DataJpaTest slice).
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = Service.class
                ),
                // Include MapStruct-generated mapper implementations by regex matching (not covered by default DataJpaTest slice).
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = ".*MapperImpl"
                )
        }
)
// Prevents Spring Boot from replacing the test database with an in-memory version.
// Ensures we use the actual Testcontainers PostgreSQL instance.
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({
        PostgresContainerConfiguration.class, // TestConfiguration class to spin up a PostgreSQL container
        ValidationAutoConfiguration.class // Enables bean validation (JSR-303) in the test context.
})
// Enables Testcontainers lifecycle management for JUnit 5 tests.
@Testcontainers
@ActiveProfiles("test")
public @interface ServiceTest {
    // No fields needed as this is a meta-annotation for reusable test configuration.
}
