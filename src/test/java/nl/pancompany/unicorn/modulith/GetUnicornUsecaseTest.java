package nl.pancompany.unicorn.modulith;

import nl.pancompany.unicorn.modulith.application.domain.Unicorn;
import nl.pancompany.unicorn.modulith.application.port.in.GetUnicornUsecase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static java.util.UUID.randomUUID;
import static org.assertj.core.api.Assertions.assertThat;

public class GetUnicornUsecaseTest {

    GetUnicornUsecase getUnicornUsecase;

    @BeforeEach
    void setup() {
        TestContext testContext = new TestContext();
        getUnicornUsecase = testContext.getGetUnicornUsecase();
    }

    @Test
    void getsUnicorn() {
        UUID unicornId = randomUUID();

        Unicorn unicorn = getUnicornUsecase.getUnicorn(unicornId);

        assertThat(unicorn).isNotNull();
    }

}
