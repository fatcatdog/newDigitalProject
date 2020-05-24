package com.payme.paymeApi.model;


import java.util.Arrays;

public class MediumsEnabledPrices {

    Boolean[] enabled;
    Integer[] rates;

    public MediumsEnabledPrices(Boolean[] enabled, Integer[] rates) {
        this.enabled = enabled;
        this.rates = rates;
    }

    public Boolean[] getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean[] enabled) {
        this.enabled = enabled;
    }

    public Integer[] getRates() {
        return rates;
    }

    public void setRates(Integer[] rates) {
        this.rates = rates;
    }

    @Override
    public String toString() {
        return "MediumsEnabledPrices{" +
                "enabled=" + Arrays.toString(enabled) +
                ", rates=" + Arrays.toString(rates) +
                '}';
    }
}
