package fr.argonaultes.restservice;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.jdbc.core.JdbcTemplate;

@JdbcTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class RestIT {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    void testIfDbExists() {
        if (System.getenv("DATABASE_URL_TEST").isBlank()) {
            jdbcTemplate.execute("SELECT 2");
            fail("Missing env variable DATABASE_URL_TEST");
        }

    }
}