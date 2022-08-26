package org.ostrade.instrument;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity(name = "Instrument")
@Table(name = "instrument")
@Data
public class InstrumentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instrument_id")
    private Long instrumentId;

    @Column(name = "execution_venue")
    @NotEmpty
    private String executionVenue;

    @Column(name = "security_type")
    @NotEmpty
    private String securityType;

    @Column(name = "cfi")
    @NotEmpty
    private String cfi;

    @Column(name = "symbol")
    @NotEmpty
    private String symbol;

    @Column(name = "description")
    @NotEmpty
    private String description;

    @Column(name = "maturity_month_year")
    @NotEmpty
    private String maturityMonthYear;

    @Column(name = "maturity_date")
    @NotNull
    private LocalDate maturityDate;

    @Column(name = "unit_of_measure")
    @NotEmpty
    private String unitOfMeasure;

    @Column(name = "unit_of_measure_quantity")
    @NotNull
    private BigDecimal unitOfMeasureQuantity;

    @Column(name = "price_unit_of_measure")
    @NotEmpty
    private String priceUnitOfMeasure;

    @Column(name = "price_unit_of_measure_quantity")
    @NotNull
    private BigDecimal priceUnitOfMeasureQuantity;

    @Column(name = "settlement_method")
    @NotEmpty
    private String settlementMethod;

    @Column(name = "price_quote_currency")
    @NotEmpty
    private String priceQuoteCurrency;

}