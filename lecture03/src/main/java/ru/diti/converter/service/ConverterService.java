package ru.diti.converter.service;

import ru.diti.converter.enums.Currency;
import ru.diti.converter.repository.CurrencyRepository;

import java.math.BigDecimal;

public class ConverterService {
    private final CurrencyRepository repository = CurrencyRepository.getInstance();

    public String convert(BigDecimal sum, Currency from, Currency to) {
        return "0.0";
    }
}
