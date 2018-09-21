package ru.diti.converter.repository;

import ru.diti.converter.enums.Currency;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class CurrencyRepository {
    private static CurrencyRepository ourInstance = new CurrencyRepository();
    private BufferedReader bufferedReader;

    public static CurrencyRepository getInstance() {
        return ourInstance;
    }

    private CurrencyRepository() {
        bufferedReader = new BufferedReader(
                new InputStreamReader(this.getClass().getClassLoader().getResourceAsStream("currency_pairs.txt")));
    }

    public BigDecimal getCoef(Currency from, Currency to) {
        return new BigDecimal("0.0");
    }
}
