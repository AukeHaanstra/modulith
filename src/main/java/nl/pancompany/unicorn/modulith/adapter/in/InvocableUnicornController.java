package nl.pancompany.unicorn.modulith.adapter.in;

import lombok.RequiredArgsConstructor;
import nl.pancompany.unicorn.modulith.application.domain.Unicorn;
import nl.pancompany.unicorn.modulith.application.port.in.GetUnicornUsecase;

import java.util.UUID;

@RequiredArgsConstructor
public class InvocableUnicornController {

    private final GetUnicornUsecase getUnicornUsecase;

    public Unicorn get(UUID unicornId) {
        return getUnicornUsecase.getUnicorn(unicornId);
    }
}
