package ru.javawebinar.topjava.service.jdbc;

import org.junit.Assume;
import org.springframework.test.context.ActiveProfiles;
import ru.javawebinar.topjava.service.AbstractUserServiceTest;

import java.util.Arrays;

import static ru.javawebinar.topjava.Profiles.JDBC;

@ActiveProfiles(JDBC)
public class JdbcUserServiceTest extends AbstractUserServiceTest {
    @Override
    public void createWithException() throws Exception {
        Assume.assumeFalse(Arrays.stream(env.getActiveProfiles()).anyMatch(s -> s.contains("jdbc")));
        super.createWithException();
    }
}