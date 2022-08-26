package org.ostrade.instrument;

import io.quarkus.grpc.GrpcService;
import io.smallrye.mutiny.Uni;
import org.ostrade.proto.instrument.Instrument;
import org.ostrade.proto.type.Empty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Inject;
import java.util.List;

@GrpcService
public class InstrumentGrpcService implements InstrumentGrpc {

    private static final Logger log = LoggerFactory.getLogger(InstrumentGrpcService.class);

    private final InstrumentService instrumentService;

    @Inject
    public InstrumentGrpcService(InstrumentService instrumentService) {
        this.instrumentService = instrumentService;
    }

    @Override
    public Uni<InstrumentList> getAll(Empty request) {
        List<Instrument> instruments = instrumentService.findAll();
        return InstrumentList.newBuilder().addAllInstruments();
    }

    @Override
    public Uni<Instrument> get(InstrumentId request) {
        return null;
    }

    @Override
    public Uni<Instrument> insert(Instrument request) {
        return null;
    }

    @Override
    public Uni<Instrument> update(Instrument request) {
        return null;
    }

    @Override
    public Uni<Empty> remove(InstrumentId request) {
        return null;
    }

}
