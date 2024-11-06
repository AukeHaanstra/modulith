package nl.pancompany.unicorn.modulith.application.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
public class Unicorn {

    @Getter
    private final UUID identifier;
}
