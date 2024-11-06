package nl.pancompany.unicorn.modulith.application.port.in;

import nl.pancompany.unicorn.modulith.application.domain.Unicorn;

import java.util.UUID;

public interface GetUnicornUsecase {
    Unicorn getUnicorn(UUID unicornId);
}
