package org.ostrade.instrument;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class InstrumentService {

    public List<Instrument> findAll() {
        return new ArrayList<>();
    }

    public Optional<Instrument> findById(long instrumentId) {
        return Optional.empty();
    }

    public Instrument save(Instrument instrument) {
        return instrument;
    }

    public Instrument update(Instrument instrument) {
        return instrument;
    }

    public void delete(long instrumentId) {

    }

}
