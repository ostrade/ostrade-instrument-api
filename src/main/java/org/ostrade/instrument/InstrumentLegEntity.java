package org.ostrade.instrument;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "InstrumentLeg")
@Table(name = "instrument_leg")
@Data
public class InstrumentLegEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_leg_id")
    private Long instrumentLegId;

    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "instrument_id")
    private InstrumentEntity instrument;

    @Column(name = "symbol")
    @NotEmpty
    private String symbol;

    @Column(name = "maturity_month_year")
    @NotEmpty
    private String maturityMonthYear;

    @Column(name = "security_type")
    @NotEmpty
    private String securityType;

    @Column(name = "side")
    @NotEmpty
    private String side;

}