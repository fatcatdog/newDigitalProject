package com.payme.paymeApi.model;

import java.util.Arrays;

public class DayTimes {
    Boolean[] days;
    Boolean[][] times;

    public DayTimes(Boolean[] days, Boolean[][] times) {
        this.days = days;
        this.times = times;
    }

    public Boolean[] getDays() {
        return days;
    }

    public void setDays(Boolean[] days) {
        this.days = days;
    }

    public Boolean[][] getTimes() {
        return times;
    }

    public void setTimes(Boolean[][] times) {
        this.times = times;
    }

    @Override
    public String toString() {
        return "DayTimes{" +
                "days=" + Arrays.toString(days) +
                ", times=" + Arrays.toString(times) +
                '}';
    }
}
