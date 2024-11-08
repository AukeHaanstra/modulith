package nl.pancompany.unicorn.modulith.application;

import lombok.Getter;
import nl.pancompany.unicorn.modulith.application.port.in.GetUnicornUsecase;
import nl.pancompany.unicorn.modulith.application.port.out.UnicornRepository;
import nl.pancompany.unicorn.modulith.application.usecase.GetUnicornService;

@Getter
public class ApplicationContext {

    private final GetUnicornUsecase getUnicornUsecase;

    public ApplicationContext(UnicornRepository unicornRepository) {
        this.getUnicornUsecase = new GetUnicornService(unicornRepository);
    }
}
