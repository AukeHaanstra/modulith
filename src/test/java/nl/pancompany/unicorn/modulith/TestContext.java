package nl.pancompany.unicorn.modulith;

import lombok.Getter;
import nl.pancompany.unicorn.modulith.adapter.out.UnicornInMemoryRepository;
import nl.pancompany.unicorn.modulith.application.ApplicationContext;
import nl.pancompany.unicorn.modulith.application.domain.Unicorn;
import nl.pancompany.unicorn.modulith.application.port.in.GetUnicornUsecase;

@Getter
public class TestContext {

    private final GetUnicornUsecase getUnicornUsecase;

    public TestContext() {
        ApplicationContext applicationContext = new ApplicationContext(new UnicornInMemoryRepository());
        getUnicornUsecase = applicationContext.getGetUnicornUsecase();
    }
}
