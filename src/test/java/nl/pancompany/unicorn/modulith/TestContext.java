package nl.pancompany.unicorn.modulith;

import lombok.Getter;
import nl.pancompany.unicorn.modulith.application.ApplicationContext;
import nl.pancompany.unicorn.modulith.application.domain.Unicorn;

@Getter
public class TestContext {

    private final GetUnicornUsecase getUnicornUsecase;

    public TestContext() {
        ApplicationContext applicationContext = new ApplicationContext(Unicorn::new);
        getUnicornUsecase = applicationContext.getGetUnicornUsecase();
    }
}
