package nl.pancompany.unicorn.modulith.application.port.out;

import nl.pancompany.unicorn.modulith.application.domain.Unicorn;

import java.util.UUID;

public interface UnicornRepository {
    Unicorn get(UUID unicornId);
}
