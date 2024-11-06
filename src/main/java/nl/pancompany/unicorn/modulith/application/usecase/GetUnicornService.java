package nl.pancompany.unicorn.modulith.application.usecase;

import lombok.RequiredArgsConstructor;
import nl.pancompany.unicorn.modulith.application.domain.Unicorn;
import nl.pancompany.unicorn.modulith.application.port.in.GetUnicornUsecase;
import nl.pancompany.unicorn.modulith.application.port.out.UnicornRepository;

import java.util.UUID;

@RequiredArgsConstructor
public class GetUnicornService implements GetUnicornUsecase {

    private final UnicornRepository unicornRepository;

    @Override
    public Unicorn getUnicorn(UUID unicornId) {
        return unicornRepository.get(unicornId);
    }
}
