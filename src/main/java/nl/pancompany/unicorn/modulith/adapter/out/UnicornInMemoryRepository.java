package nl.pancompany.unicorn.modulith.adapter.out;

import nl.pancompany.unicorn.modulith.application.domain.Unicorn;
import nl.pancompany.unicorn.modulith.application.port.out.UnicornRepository;

import java.util.UUID;

public class UnicornInMemoryRepository implements UnicornRepository {

    @Override
    public Unicorn get(UUID unicornId) {
        return new Unicorn(unicornId);
    }
}
