package pl.bekz.observer;

import java.math.BigDecimal;

public interface Observer {
    void update(BigDecimal balance);
}

